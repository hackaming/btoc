package com.ego.dubbo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.ego.dubbo.service.TbContentCategoryDubboService;
import com.ego.mapper.TbContentCategoryMapper;
import com.ego.pojo.TbContentCategory;
import com.ego.pojo.TbContentCategoryExample;

public class TbContentCategoryDubboServiceImpl implements TbContentCategoryDubboService{
	
	@Resource
	TbContentCategoryMapper tbContentCategoryMapperImpl;
	@Override
	public List<TbContentCategory> selListById(long id) {
		TbContentCategoryExample example = new TbContentCategoryExample();
		example.createCriteria().andIdEqualTo(id);
		return 	tbContentCategoryMapperImpl.selectByExample(example);
	}

}
