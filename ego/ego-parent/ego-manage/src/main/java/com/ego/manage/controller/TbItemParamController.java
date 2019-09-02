package com.ego.manage.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.manage.service.TbItemParamService;
import com.ego.pojo.TbItemParam;

@Controller
public class TbItemParamController {
	
	@Resource
	private TbItemParamService tbItemParamService;
	
	@RequestMapping("item/param/list")
	@ResponseBody
	public EasyUIDataGrid list(int page,int rows){
		return tbItemParamService.show(page, rows);
	}
	@RequestMapping("item/param/delete")
	@ResponseBody
	public EgoResult delete(String ids){
		return tbItemParamService.deleteParamByIds(ids);
	}
	@RequestMapping("item/param/query/itemcatid/{itemcatid}")
	@ResponseBody
	public EgoResult itemCat(@PathVariable long itemcatid){
		return tbItemParamService.getTbItemParamByItemCatId(itemcatid);
	}
	
	@RequestMapping("item/param/save/{itemcatid}")
	@ResponseBody
	public EgoResult save(TbItemParam tbItemParam,@PathVariable long itemcatid){
		return tbItemParamService.insTbItemParam(tbItemParam, itemcatid);
	}

}
