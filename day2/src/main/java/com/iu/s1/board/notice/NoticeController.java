package com.iu.s1.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.board.BoardVO;

@Controller
@RequestMapping(value = "/notice/**") // Notice 아래 모든 폴덜/파일
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping(value="boardList", method = {RequestMethod.POST, RequestMethod.GET })
	public String boardList() throws Exception {
//		List<BoardVO> ar = noticeService.boardList();

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
	public String boardSelect(BoardVO boardVO, Model model) throws Exception {
		boardVO = noticeService.boardSelect(boardVO);
		
//		System.out.println(boardVO.getTitle());
//		System.out.println(boardVO.getNum());
		
		model.addAttribute("vo", boardVO);
		
		return "board/boardSelect";
		
	}
	
	
}
