package com.acc.au.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acc.au.model.Trainer;
import com.acc.au.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService service;
	
	@GetMapping("/{trainerusername}")
	public Optional<Trainer> trainerlogin(@PathVariable String trainerusername) {
		return service.Auth(trainerusername);
		
	}
}
