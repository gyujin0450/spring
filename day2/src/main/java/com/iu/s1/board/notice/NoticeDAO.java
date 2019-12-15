package com.iu.s1.board.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s1.board.BoardDAO;
import com.iu.s1.board.BoardVO;
import com.iu.s1.util.Pager;

@Repository
public class NoticeDAO implements BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	private final static String NAMESPACE="NoticeMapper.";

	@Override
	public int boardWrite(BoardVO boardVO) throws Exception {
		return sqlSession.insert(NAMESPACE+"boardWrite", boardVO);
	}

	@Override
	public int boardUpdate(BoardVO boardVO) throws Exception {
		return sqlSession.update(NAMESPACE+"boardUpdate", boardVO);
	}

	@Override
	public int boardDelete(BoardVO boardVO) throws Exception {
		
		return sqlSession.delete(NAMESPACE+"boardDelete", boardVO);
	}

	@Override
	public List<BoardVO> boardList(Pager pager) throws Exception {
		return sqlSession.selectList(NAMESPACE+"boardList", pager);
	}

	@Override
	public BoardVO boardSelect(BoardVO boardVO) throws Exception {
		// int num = boardVO.getNum();
		// return sqlSession.selectOne(NAMESPACE+"boardSelect", num);
		
		return sqlSession.selectOne(NAMESPACE+"boardSelect", boardVO.getNum());
	}

	public int boardCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
