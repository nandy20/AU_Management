package com.acc.au.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acc.au.model.Student;
import com.acc.au.model.Trainer;
import com.acc.au.repository.StudentRepo;
import com.acc.au.repository.TrainerRepo;
import com.acc.au.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	TrainerRepo repo;
	
	@Autowired
	StudentRepo sturepo;
	@Override
	public String trainerlogin(String trainerUsername, String trainerPwd) {
		Trainer t=repo.findByTrainerUsername(trainerUsername);
		if(t.getTrainerPwd().equals(trainerPwd)) {
			return "success";
		}
		return "failer";
	}
	@Override
	public String studentlogin(String studentUsername, String studentPwd) {
		Student t=sturepo.findByStudentUsername(studentUsername);
		if(t.getStudentPwd().equals(studentPwd)) {
			return "success";
		}
		return "failer";
	}

	
}
