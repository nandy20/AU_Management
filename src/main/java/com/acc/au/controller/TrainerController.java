package com.acc.au.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acc.au.model.Trainer;
import com.acc.au.service.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {

	@Autowired
	TrainerService service;
	
	@PostMapping("/save")
	public String save(@RequestBody Trainer obj) {
		return service.save(obj);
		
	}
	@GetMapping("/{id}")
	public Optional<Trainer> fetch(@PathVariable Integer id ) {
		return service.fetch(id);
		
	}
}
