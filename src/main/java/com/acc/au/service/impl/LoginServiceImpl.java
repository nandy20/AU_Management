package com.acc.au.service.impl;

import java.util.Optional;

import javax.websocket.Session;

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
	public Trainer Auth(String trainerusername,String trainerpassword) {
		
	    Trainer t = repo.findByTrainerusername(trainerusername);
	    System.out.println(t.getTrainerpassword());
	    System.out.println(trainerpassword);
	    Session s;
		return t;
		
	}

}
