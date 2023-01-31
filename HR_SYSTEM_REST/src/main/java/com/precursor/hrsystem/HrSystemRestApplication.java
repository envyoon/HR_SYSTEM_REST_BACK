package com.precursor.hrsystem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;






//@RunWith(SpringRunner.class)
@SpringBootApplication
public class HrSystemRestApplication {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public static void main(String[] args) {
		SpringApplication.run(HrSystemRestApplication.class, args);
	}

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testSqlSession() throws Exception{
		System.out.println(sqlSession.toString());
	}
	
}
