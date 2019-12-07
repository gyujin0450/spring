package com.iu.s1.database;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.TestAbstract;

public class DataBaseTest extends TestAbstract {

	// @Autowired
	// private DataSource dataSource;
	
	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() throws Exception {
		// assertNotNull(dataSource.getConnection());
		assertNotNull(sqlSession);
	}

}
