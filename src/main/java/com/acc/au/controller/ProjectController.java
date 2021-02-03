package com.acc.au.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acc.au.model.Project;
import com.acc.au.service.ProjectService;

@RestController
@RequestMapping("/project")
public class ProjectController {

	@Autowired
	ProjectService service;

	@PostMapping("/save")
	public  String save(@RequestBody Project obj){
	    
		return service.save(obj);
		
	}
	
}
