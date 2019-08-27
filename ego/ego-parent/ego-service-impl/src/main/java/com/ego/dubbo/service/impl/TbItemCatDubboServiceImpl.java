package com.ego.dubbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.ego.dubbo.service.TbItemCatDubboService;
import com.ego.mapper.TbItemCatMapper;
import com.ego.pojo.TbItemCat;
import com.ego.pojo.TbItemCatExample;

public class TbItemCatDubboServiceImpl implements TbItemCatDubboService{
	@Resource
	private TbItemCatMapper tbItemCatMapper;
	
	@Override
	public List getListById(long id) {
		TbItemCatExample example = new TbItemCatExample();
		example.createCriteria().andParentIdEqualTo(id);
		return 	tbItemCatMapper.selectByExample(example );
	}

}
