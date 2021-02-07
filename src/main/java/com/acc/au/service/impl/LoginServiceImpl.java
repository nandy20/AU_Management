package com.acc.au.service.impl;

import com.acc.au.model.LoginDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.au.model.Student;
import com.acc.au.model.Trainer;
import com.acc.au.repository.StudentRepo;
import com.acc.au.repository.TrainerRepo;
import com.acc.au.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {

	@Override
	public String login(LoginDTO loginDTO) {
		if(loginDTO.getUserName().equals("admin") && loginDTO.getPassword().equals("admin")) {
			return "admin";
		} else if(loginDTO.getUserName().equals("trainer") && loginDTO.getPassword().equals("trainer")) {
			return "trainer";
		} else if(loginDTO.getUserName().equals("student") && loginDTO.getPassword().equals("student")) {
			return "student";
		}
		return "failure";
	}
}
