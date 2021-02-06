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
	
	@GetMapping("/{id}")
	public Optional<Student> fetch(@PathVariable Integer id ) {
		return stuservice.fetch(id);
		
	}
	
	@GetMapping("/batch/{batch_id}")
	public List<Student> FetchBasedOnBatch(@PathVariable("batch_id") Integer batchid){
	    return stuservice.FetchBasedOnBatch(batchid);	
	}
	
}
