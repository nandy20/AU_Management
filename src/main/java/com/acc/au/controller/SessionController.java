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
import com.acc.au.model.Session;
import com.acc.au.service.SessionService;

@RestController
@RequestMapping("/session")
public class SessionController {

	@Autowired
	SessionService service;
	
	@PostMapping("/save")
	public String save(@RequestBody Session obj) {
		return service.save(obj);
		
	}
	@GetMapping("/{id}")
	public Optional<Session> fetch(@PathVariable Integer id ) {
		return service.fetch(id);
		
	}
	
	@GetMapping("/batch/{batch_id}")
	public List<Session> fetchByBatch(@PathVariable("batch_id")Integer batchid){
		return service.fetchByBatch(batchid);
	}
	
	@GetMapping("/trainer/{trainer_id}")
	public List<Session>fetchByTrainer(@PathVariable("trainer_id")Integer trainerid){
		return service.fetchByTrainer(trainerid);
	}
}
