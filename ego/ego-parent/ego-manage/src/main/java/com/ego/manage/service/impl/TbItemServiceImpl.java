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
 * ò�Ʋ�֧������ع������ַ�ʽ������û����SPRING���涨��������صĶ�������������SERVICE�㣬ֻ����DUBBO�������������ع�����һ��
 * tbItemDesc�������������Ķ��壬���������� һ��index����¼����Ҫ���ӵģ�����ж� index�Ƿ����������ӵ���ȣ�������ȣ����쳣����spring����ʽ�����ж�������쳣Ϊrollback-for="java.lang.Exception"
 * �ɴ�ʵ�ֻع�
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
