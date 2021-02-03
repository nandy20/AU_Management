package com.acc.au.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acc.au.model.Attendance;
import com.acc.au.service.AttendanceService;

@RestController
@RequestMapping("/attendance")
public class AttendanceController {

	@Autowired
	AttendanceService service;

	@PostMapping("/save")
	public  String save(@RequestBody Attendance obj){
	    
		return service.save(obj);
		
	}
	
}
