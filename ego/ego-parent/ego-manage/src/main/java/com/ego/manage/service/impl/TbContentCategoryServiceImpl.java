package com.ego.manage.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.commons.pojo.EasyUiTree;
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
		List<TbContentCategory> list = tbContentCategoryDubboServiceImpl.selListById(id);
		for (TbContentCategory cate:list){
			EasyUiTree node = new EasyUiTree();
			node.setId(cate.getId());
			node.setText(cate.getName());
			node.setState(cate.getIsParent()?"close":"open");
		}
		return ui;
	}

}
