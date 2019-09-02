package com.ego.dubbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.dubbo.service.TbItemDubboService;
import com.ego.mapper.TbItemDescMapper;
import com.ego.mapper.TbItemMapper;
import com.ego.mapper.TbItemParamItemMapper;
import com.ego.pojo.TbItem;
import com.ego.pojo.TbItemDesc;
import com.ego.pojo.TbItemExample;
import com.ego.pojo.TbItemParamItem;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


public class TbItemDubboServiceImpl implements TbItemDubboService{
	@Resource
	private TbItemMapper tbItemMapper;
	
	@Resource
	private TbItemDescMapper tbItemDescMapperImpl;
	
	@Resource
	private TbItemParamItemMapper tbItemParamItemMapperImpl;

	@Override
	public EasyUIDataGrid show(int page, int rows) {
		
		PageHelper.startPage(page,rows);
		List<TbItem> list = tbItemMapper.selectByExample(new TbItemExample());		
		PageInfo<TbItem> pi = new PageInfo<>(list);
		
		EasyUIDataGrid grid = new EasyUIDataGrid();
		grid.setRows(pi.getList());
		grid.setTotal(pi.getTotal());
		return grid;
	}

	@Override
	public int updateTbItem(TbItem tbitem) {
		return tbItemMapper.updateByPrimaryKeySelective(tbitem);
	}

	@Override
	public int insTbItem(TbItem tbitem) {
		return tbItemMapper.insert(tbitem);
	}

	@Override
	public int insTbItemDesc(TbItem tbitem, TbItemDesc tbItemDesc,TbItemParamItem tbItemParamItem) throws Exception {
		int index = 0; 
		index += tbItemMapper.insertSelective(tbitem);
		index += tbItemDescMapperImpl.insertSelective(tbItemDesc);
		index += tbItemParamItemMapperImpl.insertSelective(tbItemParamItem);
		if (index == 3){
			return 1;
		} else {
			throw new Exception("ÐÂÔöÊ§°Ü£¡");
		}
	}
}
