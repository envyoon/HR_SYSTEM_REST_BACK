package com.precursor.hrsystem.test.a01_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.precursor.hrsystem.test.a02_service.TestService;
import com.precursor.hrsystem.test.a04_dto.TestDTO;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ModelAndView getTest() throws Exception{
		
		ModelAndView mv = new ModelAndView("/test");
		
		List<TestDTO> list = testService.getTest();
		mv.addObject("list", list);
		
		return  mv;
	}
	
	
	
}
