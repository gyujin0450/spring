package com.iu.s1.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	@GetMapping(value = "boardSelect")
	public String boardSelect(BoardVO boardVO, Model model ) throws Exception {
		
		boardVO = qnaService.boardSelect(boardVO);
		
		model.addAttribute("vo", boardVO);
		
		return "board/boardSelect";
		
	}
	
	// Update
	@GetMapping(value = "boardUpdate")
	public ModelAndView boardUpdate(BoardVO boardVO) throws Exception {
		// boardUpdate를 위해
		// 1. 화면에서 넘어온 num에 해당하는 데이터를 가져온다
		boardVO = qnaService.boardSelect(boardVO);
		
		// 2. DB에서 가져온 데이터(BoardVO)를 화면으로 넘긴다
		ModelAndView mv = new ModelAndView();
		mv.addObject("vo", boardVO);
		mv.setViewName("board/boardUpdate");
		
		return mv;
		
	}
	
	@PostMapping(value = "boardUpdate")
	public String boardUpdateDB(BoardVO boardVO) throws Exception {
		// 화면에서 수정된 데이터를 받아 DB를 업데이트하고, 
		// 성공이면 boardList롤 돌아감(X) 
		// 		==> 업데이트 내용 보여주기 위해 boardSelect 로감
		//		** 굳이 확인할 필요 없으면 리스트로 가도 될듯
		// TODO : 실패이면 오류 메시지 팝업하고, Update 양식으로!!
		int result = qnaService.boardUpdate(boardVO);
		// String view = "board/boardUpdate";
		String view = "redirect:./boardList";
		
		if (result > 0) {
			// view = "board/boardList"; 오류 발생
			// view = "redirect:./boardSelect?num="+boardVO.getNum();
			view = "redirect:./boardList";
		}
		
		return view;		
		
	}
	
	// Insert
	@GetMapping(value = "boardWrite")
	public ModelAndView boardWrite() {
		ModelAndView mv = new ModelAndView();
		System.out.println("qnaWriter");
		
		mv.setViewName("board/boardWrite");
		
		return mv;
	}
	
	@PostMapping(value = "boardWrite")
	public String boardWrite(BoardVO boardVO) throws Exception {
		
		int result = qnaService.boardWrite(boardVO);
		String view = "";
		
		if(result > 0) {
		
			view = "redirect:./boardList";
		}	
		
		return view;

	}
	
	
	// Delete
	@GetMapping(value = "boardDelete")
	public String boardDelete(BoardVO boardVO) throws Exception {
		// 화면에서 넘어온 boardVO를 DB에서 삭제함
		qnaService.boardDelete(boardVO);
		return "redirect:./boardList";
	}
	
	

}
