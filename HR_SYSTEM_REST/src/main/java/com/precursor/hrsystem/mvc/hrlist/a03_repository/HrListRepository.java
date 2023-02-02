package com.precursor.hrsystem.mvc.hrlist.a03_repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.precursor.hrsystem.mvc.vo.HrListVO;

@Repository
public interface HrListRepository {

	public List<HrListVO> getHrList(HrListVO hr);
	
}
