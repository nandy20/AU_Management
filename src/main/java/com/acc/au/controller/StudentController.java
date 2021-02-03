package com.acc.au.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acc.au.model.Student;
import com.acc.au.service.StudentService;

@RestController
@RequestMapping("/Auer")
public class StudentController {
	
	@Autowired
	StudentService stuservice;
	

	@PostMapping("/save")
	public String save(@RequestBody Student obj) {
		
		return stuservice.save(obj);
		
	}
}
