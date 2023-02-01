package com.precursor.hrsystem.mvc.hrlist.a01_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.precursor.hrsystem.mvc.hrlist.a02_service.HrListService;
import com.precursor.hrsystem.mvc.vo.HrListVO;

@RestController
@RequestMapping("/hrlist")
public class HrListController {
	
	@Autowired
	private HrListService service;
	
	//빈페이지 테스트
	/*
	 * 이렇게 설정 하는 경우 http://localhost:5050/hrlist/hrtest 로 브라우저에 접근 시
	 * return에 작성해 놓은 값을 브라우저에 넘겨줄 수 있다.
	 * 현재 이상태로 확인하는 경우 브라우저에 hrlist/index 라는 표시가 출력된다.
	 * @Controller는 뷰 페이지를 @RestController는 데이터를 전송한다는 것이다.
	 * @RestController는 @Controller와 @ResponseBody가 합쳐진 것이다.
	 * 
	 */
	@GetMapping(value = "/hrtest")
	public String hrtest(HrListVO hrList, Model model) {
		
		return "hrlist/index";
	}
	
	
}
