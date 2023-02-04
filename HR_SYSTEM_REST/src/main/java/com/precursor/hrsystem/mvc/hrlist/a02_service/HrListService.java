package com.precursor.hrsystem.mvc.hrlist.a02_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.precursor.hrsystem.mvc.vo.HrListVO;

@Service
public class HrListService {
	
	@Autowired
	private HrListService repository;
	
	public List<HrListVO> getHrList(){
		
		//List<HrListVO> hrlist = new ArrayList<HrListVO>(); 
			
		return repository.getHrList();
	}

	public List<HrListVO> getAllUsers() {
		return repository.getAllUsers();
	}
}
