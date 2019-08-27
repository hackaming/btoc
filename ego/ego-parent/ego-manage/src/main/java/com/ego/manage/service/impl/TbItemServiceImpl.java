package com.ego.manage.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.dubbo.service.TbItemDubboService;
import com.ego.manage.service.TbItemService;
import com.ego.pojo.TbItem;

@Service
public class TbItemServiceImpl implements TbItemService{
	
	@Reference
	private TbItemDubboService tbItemDubboServiceImpl;

	@Override
	public EasyUIDataGrid show(int page, int rows) {
		// TODO Auto-generated method stub
		return tbItemDubboServiceImpl.show(page, rows);
	}

	@Override
	public int update(String ids, String status) {
		TbItem tbItem = new TbItem();
		int result = 0;
		String[] sID = ids.split(",");
		
		for (String id:sID){
			tbItem.setId(Long.parseLong(id));
			tbItem.setStatus(Byte.parseByte(status));
			result += tbItemDubboServiceImpl.updateTbItem(tbItem);
		}
		if (result == sID.length){
			return 1;
		} else {
			return 0;
		}
	}

}
