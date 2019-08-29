package com.ego.manage.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.manage.service.TbItemParamService;

@Controller
public class TbItemParamController {
	
	@Resource
	private TbItemParamService tbItemParamService;
	
	@RequestMapping("item/param/list")
	@ResponseBody
	public EasyUIDataGrid list(int page,int rows){
		return tbItemParamService.show(page, rows);
	}
}
