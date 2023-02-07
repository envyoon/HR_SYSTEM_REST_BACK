package com.precursor.hrsystem.test.a02_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.precursor.hrsystem.test.a03_mapper.TestMapper;
import com.precursor.hrsystem.test.a04_dto.TestDTO;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestMapper testMapper;
	
	@Override
	public List<TestDTO> getTest() throws Exception{
		return testMapper.getTest();
	}
}
