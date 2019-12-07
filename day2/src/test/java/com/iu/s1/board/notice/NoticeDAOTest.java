package com.iu.s1.board.notice;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import com.iu.s1.TestAbstract;
import com.iu.s1.board.BoardVO;

public class NoticeDAOTest extends TestAbstract{

	@Inject
	private NoticeDAO noticeDAO;
	
	// @Test
	public void getNoticeDAO()throws Exception{
		assertNotNull(noticeDAO);
	}
	
	// @Test
	public void boardSelectTest() throws Exception {
		BoardVO boardVO = new BoardVO();
		boardVO.setNum(2);
		boardVO = noticeDAO.boardSelect(boardVO);
		assertNotNull(boardVO);
		System.out.println(boardVO);
	}
	
	// @Test
	public void boardUpdateTest() throws Exception {
		BoardVO boardVO = new BoardVO();
		
		boardVO.setNum(1);
		boardVO.setTitle("테스트");
		boardVO.setContents("테스트 입니다");
		
		int result = noticeDAO.boardUpdate(boardVO);
		assertEquals(1,result);
	}
	
	
	// @Test
	public void boardDeleteTest() throws Exception {
		BoardVO boardVO = new BoardVO();
		
		boardVO.setNum(3);
		
		int result = noticeDAO.boardDelete(boardVO);
		assertEquals(1, result);
		
	}
	
	@Test
	public void boardWriteTest() throws Exception {
		BoardVO boardVO = new BoardVO();
		
		boardVO.setWriter("최규진");
		boardVO.setTitle("테스트3");
		boardVO.setContents("테스트3입니다.");
		
		int result = noticeDAO.boardWrite(boardVO);
		assertEquals(1, result);		
		
	}

}
