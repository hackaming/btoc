package com.ego.item.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.dubbo.service.TbItemCatDubboService;
import com.ego.item.pojo.PortalMenu;
import com.ego.item.pojo.PortalMenuNode;
import com.ego.item.service.TbItemCatService;
import com.ego.pojo.TbItemCat;

@Service
public class TbItemCatServiceImpl implements TbItemCatService{

	@Reference
	private TbItemCatDubboService tbItemCatDubboServiceImpl; 
	@Override
	public PortalMenu showCatMeu() {
		List<TbItemCat> listRoot = tbItemCatDubboServiceImpl.getListById(0);
		PortalMenu pm = new PortalMenu();
		pm.setData(getAllMenu(listRoot));
		return pm;
	}
	public List<Object> getAllMenu(List<TbItemCat> list){
		List<Object> listNode = new ArrayList<>();
		for (TbItemCat cat:list){
			if (cat.getIsParent()){
				PortalMenuNode pmd = new PortalMenuNode();
				pmd.setN("<a href='/products/"+cat.getId()+".html'>"+cat.getName()+"</a>");
				pmd.setU("/products/"+cat.getId()+".html");
				pmd.setI(getAllMenu(tbItemCatDubboServiceImpl.getListById(cat.getId())));
				listNode.add(pmd);
			} else {
				listNode.add("/products/"+cat.getId()+".html"+cat.getName());
			}
		}
		return listNode;
	}
}
