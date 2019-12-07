package com.iu.s1.board.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
	
	@RequestMapping(value="/notice/boardList")
	public String boardList() throws Exception {
		System.out.println("notieBoard");
		return "board/boardList";
	}
	
	@RequestMapping(value="/board/boardWrite")
	public void boardWirte() throws Exception {
		System.out.println("notieWrite");
		// return "board/boardWrite";
	}
	
	
}
