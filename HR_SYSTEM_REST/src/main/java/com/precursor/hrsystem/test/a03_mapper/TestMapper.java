package com.precursor.hrsystem.test.a03_mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.precursor.hrsystem.test.a04_dto.TestDTO;

@Mapper
public interface TestMapper {
	
	List<TestDTO> getTest() throws Exception;
	
}
