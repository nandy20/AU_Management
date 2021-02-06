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
import com.acc.au.service.BatchService;

@RestController
@RequestMapping("/batch")
public class BatchController {
	
	@Autowired
	BatchService service;

	@PostMapping("/save")
	public  String save(@RequestBody Batch obj){
	    
		return service.save(obj);
		
	}
	
	
	@GetMapping("/{id}")
	public Optional<Batch> fetch(@PathVariable Integer id ) {
		return service.fetch(id);
		
	}
	@GetMapping("/fetch")
	public List<Batch> fetchAll() {
		return service.fetchAll();
		
	}
}
