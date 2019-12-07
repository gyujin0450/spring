package com.iu.s1.board.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoticeController {
	
	@RequestMapping(value="/notice/boardList")
	public String boardList() throws Exception {
		System.out.println("notieBoard");
		return "board/boardList";
	}
	
	@RequestMapping(value="/board/boardWrite")
	public ModelAndView boardWirte() throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("notieWrite");

		mv.setViewName("board/boardWrite"); 
		
		return mv;
	}
	
	@RequestMapping(value = "/notice/boardSelect")
	public ModelAndView boardSelect() throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("boardSelect");
		
		mv.setViewName("board/boardSelect");
		
		return mv;
	}
	
	
}
