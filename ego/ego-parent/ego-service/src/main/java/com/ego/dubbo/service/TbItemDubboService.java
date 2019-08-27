package com.ego.dubbo.service;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.pojo.TbItem;

public interface TbItemDubboService {
	
	EasyUIDataGrid show(int page,int rows);
	int updateTbItem(TbItem tbitem);
}
