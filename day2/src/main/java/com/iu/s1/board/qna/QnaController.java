package com.iu.s1.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.board.BoardVO;

@Controller
@RequestMapping(value = "/qna/**") // Notice 아래 모든 폴덜/파일
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	// List
	@GetMapping(value="boardList")
	public ModelAndView boardList() throws Exception {
		List<BoardVO> ar = qnaService.boardList();
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("list", ar);
		mv.setViewName("board/boardList");
		return mv;
		
	}
	
	// Select
	
	// Update
	
	
	// Delete

}
