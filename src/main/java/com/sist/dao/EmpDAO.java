package com.sist.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
/*
 *   @Compnent => 일반 클래스
 *   @Repository => DAO
 *   @Controller => Model
 *   @Service => BO (DAO+DAO)
 *     BaordDAO , ReplyDAO ==> BaordDAO + ReplyDAO 
 */
import java.util.*;
@Repository("dao")
public class EmpDAO extends SqlSessionDaoSupport{

	@Resource(name="sst")
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		// TODO Auto-generated method stub
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}
	
    // SqlSession 활용 
	public List<EmpVO> empAllData(){
		return getSqlSession().selectList("empAllData");
	}
}
