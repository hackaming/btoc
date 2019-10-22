package com.ego.manage.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.commons.pojo.EasyUiTree;
import com.ego.commons.pojo.EgoResult;
import com.ego.dubbo.service.TbContentCategoryDubboService;
import com.ego.manage.service.TbContentCategoryService;
import com.ego.pojo.TbContentCategory;

@Service
public class TbContentCategoryServiceImpl implements TbContentCategoryService{
	@Reference
	private TbContentCategoryDubboService tbContentCategoryDubboServiceImpl;
	@Override
	public List<EasyUiTree> getContentCategoryEasyUiTreeList(long id) {
		List<EasyUiTree> ui = new ArrayList<EasyUiTree>();
		List<TbContentCategory> list = tbContentCategoryDubboServiceImpl.selListByPId(id);
		for (TbContentCategory cate:list){
			EasyUiTree node = new EasyUiTree();
			node.setId(cate.getId());
			node.setText(cate.getName());
			node.setState(cate.getIsParent()?"closed":"open");
			ui.add(node);
		}
		return ui;
	}
	@Override
	public EgoResult insTbContentCategory(TbContentCategory cate){
		EgoResult er = new EgoResult();
		TbContentCategory tb;
		try {
			tb = tbContentCategoryDubboServiceImpl.insTbContentCategoryWithRollback(cate);
			if (tb != null){
				er.setStatus(200);
				er.setData(tb);
			} else {
				er.setData("插入异常！");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			er.setData("插入异常！");
		}
		return er;
	}
	@Override
	public EgoResult updateTbContentCategory(TbContentCategory cate) {
		EgoResult er = new EgoResult();
		Date date = new Date();
		cate.setUpdated(date);
		// need to ensure that the text's not same...
		TbContentCategory category = tbContentCategoryDubboServiceImpl.selCategoryById(cate.getId());
		List<TbContentCategory> parentList = tbContentCategoryDubboServiceImpl.selListByPId(category.getParentId());
		for (TbContentCategory item:parentList){
			if (item.getName().equals(cate.getName())){
				return er; //exist,update failure!
			}
		}
		int index = tbContentCategoryDubboServiceImpl.updateTbContentCategory(cate);
		if (1 == index ){
			er.setStatus(200);
		} 
		return er;
	}
	@Override
	public EgoResult deleteTbContentCategory(TbContentCategory cate) {
		EgoResult er = new EgoResult();
		
		cate.setStatus(0);
		Date date = new Date();
		cate.setUpdated(date);
		
		int indexUpdate = tbContentCategoryDubboServiceImpl.updateTbContentCategory(cate);
		if (indexUpdate != 1){
			return er; //Failure, no needs to set status to 200
		}
		//要判断 是不是有叶子节点
		TbContentCategory curr = tbContentCategoryDubboServiceImpl.selCategoryById(cate.getId());
		List<TbContentCategory> parengList = tbContentCategoryDubboServiceImpl.selListByPId(curr.getParentId());
		if (parengList.size()==0){
			TbContentCategory parent =tbContentCategoryDubboServiceImpl.selCategoryById(curr.getParentId());
			parent.setUpdated(date);
			parent.setIsParent(false);
			indexUpdate = tbContentCategoryDubboServiceImpl.updateTbContentCategory(parent);
			if (indexUpdate != 1){
				return er; //Failure, no needs to set status to 200
			} 
		}
		er.setStatus(200);
		return er;
	}
}
