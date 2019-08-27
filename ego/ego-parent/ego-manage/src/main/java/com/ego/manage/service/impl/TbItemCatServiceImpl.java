package com.ego.manage.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.commons.pojo.EasyUiTree;
import com.ego.dubbo.service.TbItemCatDubboService;
import com.ego.manage.service.TbItemCatService;
import com.ego.pojo.TbItemCat;

@Service
public class TbItemCatServiceImpl implements TbItemCatService{
	@Reference
	private TbItemCatDubboService tbItemCatDubboServiceImpl;

	@Override
	public List<EasyUiTree> list(long id) {
		List<EasyUiTree> list= new ArrayList<>();
		List<TbItemCat> listById = tbItemCatDubboServiceImpl.getListById(id);
		for (TbItemCat item : listById){
			EasyUiTree tree = new EasyUiTree();	
			tree.setId(item.getId());
			tree.setText(item.getName());
			tree.setState(item.getIsParent()?"closed":"open");
			list.add(tree);
		}
		return list;
	}
}
