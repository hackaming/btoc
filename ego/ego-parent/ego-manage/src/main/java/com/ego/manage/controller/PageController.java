package com.ego.manage.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.dubbo.service.TbItemDubboService;

@Controller
public class PageController {

	
	@RequestMapping("{page}")
	public String showPage(@PathVariable String page){
		return page;
	}
	@RequestMapping("/")
	public String showWelcome(){
		return "index";
	}

}
