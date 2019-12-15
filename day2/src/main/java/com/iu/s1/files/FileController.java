package com.iu.s1.files;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/files/**")
public class FileController {
	
	@Autowired
	private FileService fileService;
	
	@GetMapping("fileDown")
	public ModelAndView fileDown(FileVO fileVO) throws Exception {
		
		fileVO = fileService.fileSelect(fileVO);
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("vo", fileVO);
		mv.setViewName("fileDown");
				
		return mv;
		
	}
	
	
}
