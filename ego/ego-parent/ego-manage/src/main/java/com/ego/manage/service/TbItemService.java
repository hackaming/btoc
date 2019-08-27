package com.ego.manage.service;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;

public interface TbItemService {
	public EasyUIDataGrid show(int page,int rows);
	public int update(String ids,String status);
}
