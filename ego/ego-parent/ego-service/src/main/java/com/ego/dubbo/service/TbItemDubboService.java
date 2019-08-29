package com.ego.dubbo.service;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.pojo.TbItem;
import com.ego.pojo.TbItemDesc;

public interface TbItemDubboService {
	
	EasyUIDataGrid show(int page,int rows);
	int updateTbItem(TbItem tbitem);
	int insTbItem(TbItem tbitem);
	int insTbItemDesc(TbItem tbitem,TbItemDesc tbItemDesc) throws Exception;
}
