package com.ego.dubbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.dubbo.service.TbItemParamDubboService;
import com.ego.mapper.TbItemParamMapper;
import com.ego.pojo.TbItemParam;
import com.ego.pojo.TbItemParamExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

public class TbItemParamDubboServiceImpl implements TbItemParamDubboService{

	@Resource
	private TbItemParamMapper tbItemParamMapper;
	
	@Override
	public EasyUIDataGrid show(int page, int rows) {
		//分页，首先PagerHelper.start(),然后查询，再PageInfo.啥打包进去，最后返回
		PageHelper.startPage(page,rows);
		List<TbItemParam> list = tbItemParamMapper.selectByExampleWithBLOBs(new TbItemParamExample());
		PageInfo pi = new PageInfo(list);
		EasyUIDataGrid grid = new EasyUIDataGrid();
		grid.setRows(pi.getList());
		grid.setTotal(pi.getTotal());
		// TODO Auto-generated method stub
		return grid;
	}

}
