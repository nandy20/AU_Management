package com.acc.au.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.au.model.Attendance;
import com.acc.au.repository.AttendanceRepo;
import com.acc.au.service.AttendanceService;
@Service
public class AttendanceServiceImpl implements AttendanceService{

	@Autowired
	AttendanceRepo repo;
	
	@Override
	public String save(Attendance obj) {
		
		repo.save(obj);
		return "success";
	}

}
