package com.ego.manage.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.commons.utils.IDUtils;
import com.ego.manage.service.TbItemDescService;
import com.ego.manage.service.TbItemService;
import com.ego.pojo.TbItem;
import com.ego.pojo.TbItemDesc;

@Controller
public class TbItemController {
	
	@Resource
	private TbItemService tbItemServiceImpl;
	@Resource
	private TbItemDescService tbItemDescServiceImpl;
	@ResponseBody
	@RequestMapping("item/list")
	public EasyUIDataGrid list(int page, int rows){	
		return tbItemServiceImpl.show(page, rows);
	}
	
	@RequestMapping("rest/page/item-edit")
	public String showItemEdit(){	
		return "item-edit";
	}
	/**
	 * Delete
	 * @param ids
	 * @return
	 */
	@ResponseBody
	@RequestMapping("rest/item/delete")
	public EgoResult deletet(String ids){
		EgoResult er = new EgoResult();
		int result = tbItemServiceImpl.update(ids, "3"); 
		if (result==1){
			er.setStatus(200);
		} 
		return er;
	}
	
	/**
	 * Instock
	 * @param ids
	 * @return
	 */
	@ResponseBody
	@RequestMapping("rest/item/instock")
	public EgoResult instock(String ids){
		EgoResult er = new EgoResult();
		int result = tbItemServiceImpl.update(ids, "2"); 
		if (result==1){
			er.setStatus(200);
		} 
		return er;
	}
	
	/**
	 * reshelf
	 * @param ids
	 * @return
	 */
	@ResponseBody
	@RequestMapping("rest/item/reshelf")
	public EgoResult reshelf(String ids){
		EgoResult er = new EgoResult();
		int result = tbItemServiceImpl.update(ids, "1"); 
		if (result==1){
			er.setStatus(200);
		} 
		return er;
	}
	@ResponseBody
	@RequestMapping("item/save")
	public EgoResult save(TbItem tbItem,String desc){

		boolean binsTbItemDesc = false;
		EgoResult er = new EgoResult();
		long itemId = IDUtils.genItemId();
		Date date = new Date();
		tbItem.setId(itemId);
		tbItem.setCreated(date);
		tbItem.setUpdated(date);
		tbItem.setStatus((byte)1);
		TbItemDesc insTbItemDesc = new TbItemDesc();
		insTbItemDesc.setItemId(itemId);
		insTbItemDesc.setCreated(date);
		insTbItemDesc.setUpdated(date);
		insTbItemDesc.setItemDesc(desc);
		
		binsTbItemDesc = tbItemServiceImpl.insTbItemTbItemDesc(tbItem, insTbItemDesc);
		if (binsTbItemDesc){
			er.setStatus(200);
		} else {
			er.setData("ÐÂÔöÊ§°Ü£¡");
		}
		return er;
	}
	
}
