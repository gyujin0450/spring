package com.iu.s1.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.board.BoardVO;

@Controller
@RequestMapping(value = "/notice/**") // Notice 아래 모든 폴덜/파일
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping(value = "boardDelete", method=RequestMethod.GET)
	public String boardDelete(BoardVO boardVO) throws Exception {
		noticeService.boardDelete(boardVO);
		return "redirect:./boardList";
	}
		
	@RequestMapping(value = "boardUpdate", method= RequestMethod.GET)
	public ModelAndView boardUpdate(BoardVO boardVO) throws Exception {
		// 컨트롤러와 view 연결 작업
		ModelAndView mv = new ModelAndView();		
		boardVO = noticeService.boardSelect(boardVO);
		mv.addObject("vo", boardVO);
		mv.setViewName("board/boardUpdate");
		
		return mv;
	}
	
	// 수정사항 DB 반영
	@RequestMapping(value = "boardUpdate", method= RequestMethod.POST)
	public String boardUpdateDB(BoardVO boardVO) throws Exception {
		
		int result = noticeService.boardUpdate(boardVO);
		String view = "redirect:./boardList";
		
		if(result > 0 ) {
			view = "redirect:./boardSelect?num="+boardVO.getNum();
		}
		
		return view;
	}
	
	
	@RequestMapping(value="boardList", method = {RequestMethod.POST, RequestMethod.GET })
	public ModelAndView boardList() throws Exception {
		ModelAndView mv = new ModelAndView();
		List<BoardVO> ar = noticeService.boardList();
		
		mv.addObject("list", ar);
		mv.setViewName("board/boardList");

		return mv;
	}
	
	// 입력 양식의 내용을 DB에 저장함
	@RequestMapping(value="boardWrite", method = RequestMethod.POST)
	public String boardWirte(BoardVO boardVO, MultipartFile [] files) throws Exception {
		
//		System.out.println(boardVO.getTitle());
		
		int result = noticeService.boardWrite(boardVO, files);
		String view = "";
		
		if(result > 0 ) {
//			view = "board/boardList";
			view = "redirect:./boardList";  // redirect, forward 개념이해 필요 -- 주민센터에서 민원처리 방식
		}
		
		return view;
	}
	
	// 단순히 폼양식으로 가는 경우
	@RequestMapping(value="boardWrite", method = RequestMethod.GET)
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
