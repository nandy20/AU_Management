package com.acc.au.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}