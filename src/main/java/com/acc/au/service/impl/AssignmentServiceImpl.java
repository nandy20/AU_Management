package com.acc.au.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.au.model.Assignment;
import com.acc.au.repository.AssignmentRepo;
import com.acc.au.service.AssignmentService;
@Service
public class AssignmentServiceImpl implements AssignmentService{

	@Autowired
	AssignmentRepo repo;
	
	@Override
	public String save(Assignment obj) {
		
		repo.save(obj);
		return "success";
	}

}
