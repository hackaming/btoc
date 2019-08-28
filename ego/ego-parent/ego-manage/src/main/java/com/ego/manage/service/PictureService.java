package com.ego.manage.service;

import java.io.IOException;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface PictureService {
	Map<String,Object> upload(MultipartFile filename) throws IOException;
}
