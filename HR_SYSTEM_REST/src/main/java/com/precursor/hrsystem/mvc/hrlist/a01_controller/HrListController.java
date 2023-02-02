package com.precursor.hrsystem.mvc.hrlist.a01_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	 * 23.02.02 추가
	 * RestController만으로는 화면을 뽑아 낼 수 없다.
	 * @RestController 어노테이션은 XML이나 JSON으로 응답하는 역할만 하기 때문이다.
	 * JSON으로 반환을 하였을 때, 이 JSON데이터를 클라이언트가 받은 뒤 알아서 화면을 구성하는게 React/Vue가 하는 일이다.
	 * HTML(및 jsp)은 Controller에서 처리를 진행한다.
	 * 
	 * 즉, @RestController 어노테이션만 사용해서 개발을 진행 할 경우 화면 이동하는 걸 배제한 채 개발을 해야 한다.
	 * 
	 */
	@GetMapping(value = "/test")
	public String test() {
		return "test";
	}
	
	
	/**
	 * 모든 HR 인사정보를 가져오는 API
	 * @return ResponEntity<List<HrListVO>> 200 OK, HR 인사 정보 목록
	 */
	@GetMapping(value = "/hrlist-all")
	public ResponseEntity<List<HrListVO>> getHrList(){
		
		List<HrListVO> hrList = service.getHrList(null);
		
		return new ResponseEntity<>(hrList, HttpStatus.OK);
	}
	
	
}
