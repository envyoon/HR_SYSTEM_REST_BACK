package com.precursor.hrsystem.test.a01_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.precursor.hrsystem.test.a02_service.TestService;
import com.precursor.hrsystem.test.a04_dto.TestDTO;

@RestController
public class TestApiController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping(value = "/api/test")
	public List<TestDTO> getTest() throws Exception{
		return testService.getTest();
	}
}
