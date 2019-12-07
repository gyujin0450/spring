package com.iu.s1.board.qna;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import com.iu.s1.TestAbstract;
import com.iu.s1.board.BoardVO;

public class QnaDAOTest extends TestAbstract{

	@Inject
	private QnaDAO qnaDAO;
	
	// @Test
	public void getQnaDAO() {
		assertNotNull(qnaDAO);
	}
	
	// @Test
	public void boardSelectTest() throws Exception {
		BoardVO boardVO = new BoardVO();
		
		boardVO.setNum(1);
		boardVO = qnaDAO.boardSelect(boardVO);
		assertNotNull(boardVO);
		System.out.println(boardVO);
	}

	// @Test
	public void boardUpdateTest() throws Exception {
		BoardVO boardVO = new BoardVO();
		
		boardVO.setNum(1);
		boardVO.setTitle("테스트");
		boardVO.setContents("테스트 입니다");
		
		int result = qnaDAO.boardUpdate(boardVO);
		assertEquals(1,result);
	}
	
	// @Test
	public void boardDeleteTest() throws Exception {
		BoardVO boardVO = new BoardVO();
		
		boardVO.setNum(1);
		
		int result = qnaDAO.boardDelete(boardVO);
		assertEquals(1, result);
		
	}
	
	@Test
	public void boardWriteTest() throws Exception {
		BoardVO boardVO = new BoardVO();
		
		boardVO.setWriter("최규진");
		boardVO.setTitle("질문1");
		boardVO.setContents("질문1입니다.");
		
		int result = qnaDAO.boardWrite(boardVO);
		assertEquals(1, result);		
		
	}
	
	
}
