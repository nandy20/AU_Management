package com.acc.au.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.acc.au.model.Trainer;
import com.acc.au.repository.TrainerRepo;
import com.acc.au.service.TrainerService;

@Service
public class TrainerServiceImpl implements TrainerService{

	@Autowired
	TrainerRepo repo;
	
	@Autowired
    private JavaMailSender emailSender;

	@Override
	public String save(Trainer obj) {
		repo.save(obj);
		SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("nandhini17094@cse.ssn.edu.in");
        message.setTo("nandysindhu2012@gmail.com"); 
        message.setSubject("Welcome to AU!!!"); 
        message.setText("You are added as trainer in AU2021");
        emailSender.send(message);
		
		return "success";
	}
	@Override
	public Optional<Trainer> fetch(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	
}
