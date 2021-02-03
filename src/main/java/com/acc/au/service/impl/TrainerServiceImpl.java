package com.acc.au.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.au.model.Trainer;
import com.acc.au.repository.TrainerRepo;
import com.acc.au.service.TrainerService;

@Service
public class TrainerServiceImpl implements TrainerService{

	@Autowired
	TrainerRepo repo;
	@Override
	public String save(Trainer obj) {
		repo.save(obj);
		return "success";
	}

	
}
