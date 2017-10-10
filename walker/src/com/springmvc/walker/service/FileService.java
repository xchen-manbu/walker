package com.springmvc.walker.service;

import java.util.List;
import java.util.Map;

import com.springmvc.walker.entity.Page;

public interface FileService {

	public List<Map<String, Object>> getFilePage(Map<String, Object> paraMap, Page page);

	public void saveFile(Map<String, Object> paraMap);
	
	public void deleteFile(String ids);
	
	public Map<String, Object> getFileById(String id);
	
	public Map<String, Object> getFileByName(String name);
}