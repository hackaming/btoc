package com.ego.dubbo.service;

import java.util.List;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.pojo.TbItemParam;

public interface TbItemParamDubboService {
	EasyUIDataGrid show(int page,int rows);
}
