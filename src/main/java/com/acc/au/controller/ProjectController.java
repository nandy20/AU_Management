package com.acc.au.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acc.au.model.Batch;
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
	
	@GetMapping("/{id}")
	public Optional<Project> fetch(@PathVariable Integer id ) {
		return service.fetch(id);
		
	}
	@GetMapping("/fect")
	public List<Project> fetchAll( ) {
		return service.fetchAll();
		
	}
	
}
