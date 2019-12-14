package com.iu.s1.files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

public class FileController {
	
	@Autowired
	private FileService fileService;
	
	public ModelAndView fileDown(FileVO fileVO) throws Exception {
		
		fileVO = fileService.fileSelect(fileVO);
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("vo", fileVO);
		mv.setViewName("fileDown");
				
		return mv;
		
	}
	
	
}
