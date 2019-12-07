package com.iu.s1.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.board.BoardService;
import com.iu.s1.board.BoardVO;

@Service
public class QnaService implements BoardService {
	
	@Autowired
	private QnaDAO qnaDAO;

	@Override
	public int boardWrite(BoardVO boardVO) throws Exception {
		return qnaDAO.boardWrite(boardVO);
	}

	@Override
	public int boardUpdate(BoardVO boardVO) throws Exception {
		return qnaDAO.boardUpdate(boardVO);
	}

	@Override
	public int boardDelete(BoardVO boardVO) throws Exception {
		return qnaDAO.boardDelete(boardVO);
	}

	@Override
	public List<BoardVO> boardList() throws Exception {
		return qnaDAO.boardList();
	}

	@Override
	public BoardVO boardSelect(BoardVO boardVO) throws Exception {
		return qnaDAO.boardSelect(boardVO);
	}

}
