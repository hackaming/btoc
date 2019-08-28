package com.ego.manage.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.ego.manage.service.PictureService;

@Controller
public class PIctureController {
	private Logger logger;
	@Resource
	private PictureService pictureServiceImpl;
	
	@RequestMapping("pic/upload")
	@ResponseBody
	public Map<String,Object> upload(MultipartFile uploadFile){
		Map<String, Object> upload = null;
			try {
				upload = pictureServiceImpl.upload(uploadFile);
			} catch (IOException e) {
				upload.put("error", 1);
				upload.put("message", "Í¼Æ¬ÉÏ´«Ê§°Ü");
				e.printStackTrace();
			} 
			return upload;			
	}
}
