package com.sy.bnb.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("mainDAO")
public class MainDAO {

	@Resource(name="sqlSession")
	private SqlSessionTemplate sqlSession;
	
	public String getNow(){
		String a =  (String) sqlSession.selectOne("getNow");
		return a;
	}
}
