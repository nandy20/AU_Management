package com.acc.au.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acc.au.model.Assignment;
import com.acc.au.service.AssignmentService;

@RestController
@RequestMapping("/Assignment")
public class AssignmentController {
	
	@Autowired
	AssignmentService service;

	@PostMapping("/save")
	public  String save(@RequestBody Assignment obj){
	    
		return service.save(obj);
		
	}
	
	
	
}