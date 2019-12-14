package com.iu.s1.util;

import java.io.File;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

public class FileSave {
	
	// Spring 에서 제공하는 FileCopyUtils 클래스의 Copy method
	public String save(String realPath, MultipartFile files) throws Exception {
		
		File file = new File(realPath);
		
		if(!file.exists()) {
			file.mkdirs();
		}
		
		// UUID 를 활용한 화일명 중복 회피
		String fileName = UUID.randomUUID().toString();
		fileName = fileName+"_"+files.getOriginalFilename();
		
		System.out.println(fileName);
		
		file = new File(file, fileName);
		
		FileCopyUtils.copy(files.getBytes(), file);
		
		return fileName;		
	}

	// MultipartFile의 메소드 transferTo 메소드
	
	
}
