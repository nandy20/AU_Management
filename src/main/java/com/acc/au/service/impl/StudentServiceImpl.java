package com.acc.au.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.au.model.Student;
import com.acc.au.repository.StudentRepo;
import com.acc.au.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepo repo;
	
	@Override
	public String save(Student obj) {
		repo.save(obj);
		return "success";
	}

}
