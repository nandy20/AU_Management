package com.acc.au.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.au.model.Trainer;
import com.acc.au.repository.TrainerRepo;
import com.acc.au.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	TrainerRepo repo;
	
	@Override
	public Optional<Trainer> Auth(String trainerusername) {
		
	    Optional<Trainer> t = repo.findByTrainerusername(trainerusername);
	    System.out.println(t.toString());
		return t;
		
	}

}
