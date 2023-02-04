package com.precursor.hrsystem.mvc.hrlist.a03_repository;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.precursor.hrsystem.mvc.vo.HrListVO;

@Mapper
@Repository
public interface HrListRepository {
	
	
	public List<HrListVO> getHrList();
	
	
		
	public List<HrListVO> getAllUsers();
	
}
