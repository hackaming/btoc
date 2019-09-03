package com.ego.dubbo.service;

import java.util.List;

import com.ego.pojo.TbContentCategory;

public interface TbContentCategoryDubboService {
	List<TbContentCategory> selListByPId(long id);
	int insTbContentCategory(TbContentCategory cate);
	int updateTbContentCategory(TbContentCategory cate);
	TbContentCategory insTbContentCategoryWithRollback(TbContentCategory cate) throws Exception;
}
