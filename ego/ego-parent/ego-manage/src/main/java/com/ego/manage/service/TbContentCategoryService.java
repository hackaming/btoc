package com.ego.manage.service;

import java.util.List;

import com.ego.commons.pojo.EasyUiTree;
import com.ego.commons.pojo.EgoResult;
import com.ego.pojo.TbContentCategory;

public interface TbContentCategoryService {
	List <EasyUiTree> getContentCategoryEasyUiTreeList(long id);
	public EgoResult insTbContentCategory(TbContentCategory cate) throws Exception;
}
