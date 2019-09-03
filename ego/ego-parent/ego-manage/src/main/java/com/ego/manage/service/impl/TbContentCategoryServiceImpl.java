package com.ego.manage.service.impl;

import java.util.ArrayList;
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
		System.out.println("TbContentCategoryDubboService:list size is:"+list.size());
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
	public EgoResult insTbContentCategory(TbContentCategory cate) throws Exception {
		EgoResult er = new EgoResult();
		TbContentCategory tb = tbContentCategoryDubboServiceImpl.insTbContentCategoryWithRollback(cate);
		if (tb != null){
			er.setStatus(200);
			er.setData(tb);
		}
		return er;
	}

}
