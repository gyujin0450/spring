package com.iu.s1.board;


import java.util.List;

import com.iu.s1.util.Pager;

public interface BoardDAO {
	
	//글쓰기
	public int boardWrite(BoardVO boardVO) throws Exception;
	
	//글수정
	public int boardUpdate(BoardVO boardVO)throws Exception;
	
	//글삭제
	public int boardDelete(BoardVO boardVO)throws Exception;
	
	//글리스트
	public List<BoardVO> boardList(Pager pager) throws Exception;
	
	//글보기
	public BoardVO boardSelect(BoardVO boardVO)throws Exception;

}
