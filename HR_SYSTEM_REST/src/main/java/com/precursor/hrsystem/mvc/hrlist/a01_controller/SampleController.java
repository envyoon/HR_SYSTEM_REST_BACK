package com.precursor.hrsystem.mvc.hrlist.a01_controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.precursor.hrsystem.mvc.hrlist.a02_service.SampleService;
import com.precursor.hrsystem.mvc.vo.HrListVO;

@Controller
@ResponseBody
@RequestMapping("/")
public class SampleController {
	
	@Autowired
	private SampleService service;
	
	/**
	 * 23.02.06
	 * 여기서 알 수 있는 점은 RestController는 return 할 때 JSON 데이터를 리턴하는데, 
	 * String 값이면 String 을 리턴하고 
	 * 객체면 객체를 리턴하고
	 * List면 List를 리턴한다.
	 * 
	 * DB에 데이터를 가져오려면 List 형태로 가져와야 하는데 
	 * 어떠한 식으로 가져올지 테스트를 진행 해야한다. 
	 * 
	 * Controller만 사용했을때는 ModelAndView를 사용하여 
	 * 페이지와 데이터를 동시에 가져왔지만 
	 * 
	 * RestController를 사용하려면 빽단에서는 JSON 형식으로 리턴만 해준다.
	 * 그러므로 Backend와 Frontend가 나뉠 수 있는 것이다.
	 * 
	 */
	
	
	// String 형태의 메세지 리턴
	@RequestMapping(value = "/sample")
	public String sampleCon() {
		
		return "ok";
	}
	
	// 객체 형태의 메세지 리턴
	@RequestMapping(value = "/sample2", method=RequestMethod.GET)
	public HrListVO test2(){
		
		HrListVO hr = new HrListVO();
		
		hr.setImUserNameKr("허윤석");
		hr.setImUserRank("주임");
		
		return hr;
	}
	
	// List 형태의 메세지 리턴 
	@RequestMapping(value = "/sample3", method=RequestMethod.GET)
	public List<HrListVO> test3(){
		
		List<HrListVO> hr = new ArrayList<>();
		
		
		for(int i=0; i<10; i++) {
			HrListVO hrhr = new HrListVO();
			hrhr.setImKey(i);
			hrhr.setImUserNameKr("허윤석");
			hrhr.setImUserRank("주임");
			hr.add(hrhr);
		}
		
		
		return hr;
	}
}
