package com.ego.manage.service;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;

public interface TbItemParamService {
	EasyUIDataGrid show(int page,int rows);
	EgoResult deleteParamById(String id);
	EgoResult deleteParamByIds(String ids);
}
