package com.ego.item.controller;

import javax.annotation.Resource;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ego.item.service.TbItemCatService;

@Controller
public class TbItemController {
	
	@Resource
	private TbItemCatService tbItemCatServiceImpl;
		
	/**
	 * return jasonp format data
	 * @param callback
	 * @return
	 */
	@RequestMapping("rest/itemcat/all")
	@ResponseBody
	public MappingJacksonValue showMenu(String callback){
		MappingJacksonValue mjv = new MappingJacksonValue(tbItemCatServiceImpl.showCatMeu());
		mjv.setJsonpFunction(callback);
		return mjv;
	}
	
	/**
	 * Debug method....try to find out why above url does not work.
	 */
	@RequestMapping("rest/itemcat/all2222")
	@ResponseBody
	public void showMenu2222(){
		System.out.print("Test");
	}
}
