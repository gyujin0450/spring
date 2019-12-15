package com.iu.s1.files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FileService {
	
	@Autowired
	private FileDAO fileDAO;
	
	public FileVO fileSelect(FileVO fileVO) throws Exception{
		return fileDAO.fileSelect(fileVO);
		
	}

}
