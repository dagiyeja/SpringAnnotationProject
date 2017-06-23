package com.sist.lib;


import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/* 생성자는 resource, qualifier못씀. 
 * <bean id="sst"
class="org.mybatis.spring.SqlSessionTemplate"	>
<constructor-arg ref="ssf"/>
</bean>*/

@Component("sst")
public class MySqlSessionTemplate extends SqlSessionTemplate{
	@Autowired
	//생성자는 안되서, parameter에 씀
	public MySqlSessionTemplate(@Qualifier("ssf")SqlSessionFactory sqlSessionFactory) {
		super(sqlSessionFactory);
		
	}

}
