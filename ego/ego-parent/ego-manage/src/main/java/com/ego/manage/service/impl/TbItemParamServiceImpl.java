package com.ego.manage.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.dubbo.service.TbItemParamDubboService;
import com.ego.manage.service.TbItemParamService;

@Service
public class TbItemParamServiceImpl implements TbItemParamService {
	
	@Reference
	private TbItemParamDubboService tbItemParamDubboServiceImpl;
	
	@Override
	public EasyUIDataGrid show(int page, int rows) {
		// TODO Auto-generated method stub
		return tbItemParamDubboServiceImpl.show(page, rows);
	}

}
