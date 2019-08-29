package com.ego.manage.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.dubbo.service.TbItemDescDubboService;
import com.ego.manage.service.TbItemDescService;
import com.ego.pojo.TbItemDesc;

@Service
public class TbItemDescServiceImpl implements TbItemDescService{

	@Reference
	private TbItemDescDubboService tbItemDescDubboService;
	@Override
	public Boolean insTbItemDesc(TbItemDesc tbItemDesc) {
		int insTbItemDesc = tbItemDescDubboService.insTbItemDesc(tbItemDesc);
		return insTbItemDesc==1?true:false;
	}

}
