package com.ego.manage.service;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.pojo.TbItemParam;

public interface TbItemParamService {
	EasyUIDataGrid show(int page,int rows);
	EgoResult deleteParamById(String id);
	EgoResult deleteParamByIds(String ids);
	EgoResult  getTbItemParamByItemCatId(long id);
	EgoResult insTbItemParam(TbItemParam tbItemParam,long itemCatId);
}
