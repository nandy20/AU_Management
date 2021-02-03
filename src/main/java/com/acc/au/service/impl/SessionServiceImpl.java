package com.acc.au.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.au.model.Session;
import com.acc.au.repository.SessionRepo;
import com.acc.au.service.SessionService;
@Service
public class SessionServiceImpl implements SessionService{

	@Autowired
	SessionRepo repo;
	@Override
	public String save(Session obj) {
		
		repo.save(obj);
		return "success";
	}

	
}
