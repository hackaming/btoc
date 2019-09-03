package com.ego.dubbo.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.ego.commons.utils.IDUtils;
import com.ego.dubbo.service.TbContentCategoryDubboService;
import com.ego.mapper.TbContentCategoryMapper;
import com.ego.pojo.TbContentCategory;
import com.ego.pojo.TbContentCategoryExample;

public class TbContentCategoryDubboServiceImpl implements TbContentCategoryDubboService{
	
	@Resource
	TbContentCategoryMapper tbContentCategoryMapperImpl;
	@Override
	public List<TbContentCategory> selListByPId(long id) {
		TbContentCategoryExample example = new TbContentCategoryExample();
		example.createCriteria().andParentIdEqualTo(id).andStatusEqualTo(1);
		return 	tbContentCategoryMapperImpl.selectByExample(example);
	}
	@Override
	public int insTbContentCategory(TbContentCategory cate) {
		// TODO Auto-generated method stub
		return tbContentCategoryMapperImpl.insertSelective(cate);
	}
	@Override
	public int updateTbContentCategory(TbContentCategory cate) {
		// TODO Auto-generated method stub
		return tbContentCategoryMapperImpl.updateByPrimaryKeySelective(cate);
	}
	@Override
	public TbContentCategory insTbContentCategoryWithRollback(TbContentCategory cate) throws Exception{
		// need to confirm if the cate's exist first
		TbContentCategoryExample example = new TbContentCategoryExample();
		example.createCriteria().andParentIdEqualTo(cate.getParentId());
		List<TbContentCategory> list = tbContentCategoryMapperImpl.selectByExample(example);
		for (TbContentCategory item:list){
			if (item.getName().equals(cate.getName())){
				return null;
			}
		}
		
		Date date = new Date();
		cate.setCreated(date);
		cate.setUpdated(date);
		long id = IDUtils.genItemId();
		cate.setId(id);
		cate.setIsParent(false);
		cate.setSortOrder(1);
		cate.setStatus(1);
		
		TbContentCategory parent = new TbContentCategory(); //update the parent's is parent status
		parent.setId(cate.getParentId());
		parent.setIsParent(true);
		
		int index = 0;
		index += tbContentCategoryMapperImpl.insertSelective(cate);
		index += tbContentCategoryMapperImpl.updateByPrimaryKeySelective(parent); //update the parent's is parent status
		if (2 != index){
			throw new Exception("TBContentCategory insert failed!");
		}
		return cate;
	}
	@Override
	public TbContentCategory selCategoryById(long id) {
		return tbContentCategoryMapperImpl.selectByPrimaryKey(id);
	}

}
