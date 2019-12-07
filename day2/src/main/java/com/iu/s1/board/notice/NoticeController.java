package com.iu.s1.board.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/notice/**") // Notice 아래 모든 폴덜/파일
public class NoticeController {
	
	@RequestMapping(value="boardList", method = {RequestMethod.POST, RequestMethod.GET })
	public String boardList(NoticeVO noticeVO) throws Exception {
		// TO DO : 멤버변수로 갖는 Bean(VO) 선언 
		System.out.println(noticeVO.getNum());
		System.out.println(noticeVO.getTitle());
		System.out.println("notieBoard");
		return "board/boardList";
	}
	
	@RequestMapping(value="boardWrite")
	public ModelAndView boardWirte() throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("notieWrite");

		mv.setViewName("board/boardWrite"); 
		
		return mv;
	}
	
	@RequestMapping(value = "boardSelect")
	public ModelAndView boardSelect() throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("boardSelect");
		
		mv.setViewName("board/boardSelect");
		
		return mv;
	}
	
	
}
