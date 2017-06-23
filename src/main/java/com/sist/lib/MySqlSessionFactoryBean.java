package com.sist.lib;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import java.io.*;
/*
 * <bean id="ssf" class="org.mybatis.spring.SqlSessionFactoryBean"
		p:dataSource-ref="ds"
		p:configLocation="classpath:Config.xml"
	/>
 * 
 * */

@Component("ssf")
public class MySqlSessionFactoryBean extends SqlSessionFactoryBean{

	@Resource(name="ds") //ds의 전체정보 넘김
	public void setDataSource(DataSource dataSource) {
		// TODO Auto-generated method stub
		super.setDataSource(dataSource);
	}
	public MySqlSessionFactoryBean(){
		try{
				org.springframework.core.io.Resource res=new ClassPathResource("Config.xml");
				setConfigLocation(res);
		}catch(Exception ex){
			
		}
	}
	
}
