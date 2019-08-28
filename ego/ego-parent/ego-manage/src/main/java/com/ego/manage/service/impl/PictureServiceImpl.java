package com.ego.manage.service.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ego.commons.utils.FtpUtil;
import com.ego.commons.utils.IDUtils;
import com.ego.manage.service.PictureService;

@Service
public class PictureServiceImpl implements PictureService{

	@Value("${ftpclient.host}")
	private String host;
	@Value("${ftpclient.port}")
	private int port;
	@Value("${ftpclient.username}")
	private String username;
	@Value("${ftpclient.password}")
	private String password;
	@Value("${ftpclient.basepath}")
	private String basePath;
	@Value("${ftpclient.filepath}")
	private String filepath;
	
	private Logger logger = Logger.getLogger(PictureServiceImpl.class);
	@Override
	public Map<String,Object> upload(MultipartFile file) throws IOException {
		
		Boolean success = false;
		Map<String,Object> retMap = new HashMap<String,Object>();

		String filename = IDUtils.genImageName()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		logger.info("Ftp to:"+host+port+username+password+basePath+filepath+filename);
		
		success= FtpUtil.uploadFile(host, port, username, password, basePath, filepath, filename, file.getInputStream());
		
		if (success){
			retMap.put("error", 0);
			retMap.put("url","http://"+ host+"/"+filename);
		} else {
			retMap.put("error", 1);
			retMap.put("message", "Í¼Æ¬ÉÏ´«Ê§°Ü");
		}
		return retMap;
	}

}
