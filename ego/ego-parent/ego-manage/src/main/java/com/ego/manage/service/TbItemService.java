package com.ego.manage.service;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.pojo.TbItem;
import com.ego.pojo.TbItemDesc;
import com.ego.pojo.TbItemParamItem;

public interface TbItemService {
	public EasyUIDataGrid show(int page,int rows);
	public int update(String ids,String status);
	public boolean insTbItem(TbItem tbItem);
	public boolean insTbItemTbItemDesc(TbItem tbItem,TbItemDesc tbItemDesc,TbItemParamItem tbItemParamItem);
}
