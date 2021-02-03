package com.acc.au.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acc.au.model.AssignmentEvaluation;
import com.acc.au.service.AssignmentEvaluationService;

@RestController
@RequestMapping("/assigneval")
public class AssignmentEvaluationController {
	
	@Autowired
	AssignmentEvaluationService service;

	@PostMapping("/save")
	public  String save(@RequestBody AssignmentEvaluation obj){
	    
		return service.save(obj);
		
	}
	
	
	
}
