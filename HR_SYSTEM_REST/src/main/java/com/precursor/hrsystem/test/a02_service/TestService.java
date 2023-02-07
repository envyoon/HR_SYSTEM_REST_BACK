package com.precursor.hrsystem.test.a02_service;

import java.util.List;
import com.precursor.hrsystem.test.a04_dto.TestDTO;


public interface TestService {

	List<TestDTO> getTest() throws Exception;
	
}
