package com.iu.s1.files;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FileDAO {

	@Autowired
	private SqlSession sqlSession;
	private static final String NAMESPACE="FilesMapper.";
	
	public FileVO fileSelect(FileVO fileVO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"fileSelct",fileVO);
	}
	
	public int fileWriter(FileVO fileVO) throws Exception{
				
		return sqlSession.insert(NAMESPACE+"fileWriter",fileVO);
		
	}
	
}
