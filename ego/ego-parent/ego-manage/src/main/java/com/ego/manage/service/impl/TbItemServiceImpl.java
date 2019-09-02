package com.ego.manage.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.dubbo.service.TbItemDubboService;
import com.ego.manage.service.TbItemService;
import com.ego.pojo.TbItem;
import com.ego.pojo.TbItemDesc;
import com.ego.pojo.TbItemParamItem;

@Service
public class TbItemServiceImpl implements TbItemService{
	
	@Reference
	private TbItemDubboService tbItemDubboServiceImpl;

	@Override
	public EasyUIDataGrid show(int page, int rows) {
		// TODO Auto-generated method stub
		return tbItemDubboServiceImpl.show(page, rows);
	}
/**
 * 貌似不支持事务回滚，这种方式，根本没有在SPRING里面定义与它相关的东西，而且这是SERVICE层，只能在DUBBO层才能做到事务回滚，看一下
 * tbItemDesc插入两个东西的定义，做法：设置 一个index，记录所有要增加的，最后判断 index是否与所相增加的相等，如果不等，抛异常，在spring声明式事务中定义这个异常为rollback-for="java.lang.Exception"
 * 由此实现回滚
 */
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

	@Override
	public boolean insTbItem(TbItem tbItem) {
		int insTbItem = tbItemDubboServiceImpl.insTbItem(tbItem);
		return insTbItem==1?true:false;
	}

	@Override
	public boolean insTbItemTbItemDesc(TbItem tbItem, TbItemDesc tbItemDesc,TbItemParamItem tbItemParamItem) {
		try {
			return tbItemDubboServiceImpl.insTbItemDesc(tbItem, tbItemDesc,tbItemParamItem)==1?true:false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
