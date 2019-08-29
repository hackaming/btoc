package com.ego.manage.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.dubbo.service.TbItemCatDubboService;
import com.ego.dubbo.service.TbItemDubboService;
import com.ego.dubbo.service.TbItemParamDubboService;
import com.ego.manage.pojo.TbItemParamChild;
import com.ego.manage.service.TbItemParamService;
import com.ego.pojo.TbItemCat;
import com.ego.pojo.TbItemParam;

@Service
public class TbItemParamServiceImpl implements TbItemParamService {
	
	@Reference
	private TbItemParamDubboService tbItemParamDubboServiceImpl;
	@Reference
	private TbItemCatDubboService tbItemCatDubboService;
	
	@Override
	public EasyUIDataGrid show(int page, int rows) {

		EasyUIDataGrid show = tbItemParamDubboServiceImpl.show(page, rows);
		List<TbItemParam> itemParamList = (List<TbItemParam>) show.getRows();
		List<TbItemParamChild> itemParamChildList =new ArrayList<TbItemParamChild>();
		for (TbItemParam item:itemParamList){
			TbItemParamChild child = new TbItemParamChild();
			child.setCreated(item.getCreated());
			child.setId(item.getId());
			child.setItemCatId(item.getItemCatId());
			child.setParamData(item.getParamData());
			child.setUpdated(item.getUpdated());
			child.setItemCatName(tbItemCatDubboService.getById(item.getId()).getName());
			itemParamChildList.add(child);
		}
		EasyUIDataGrid er = new EasyUIDataGrid();
		er.setRows(itemParamChildList);
		er.setTotal(itemParamChildList.size());
		return er;
	}

}
