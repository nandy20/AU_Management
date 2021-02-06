package com.acc.au.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acc.au.service.LoginService;
 
@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginService service;
	@GetMapping("trainer/{trainer_username}/{trainer_password}")
	public String trainerlogin(@PathVariable("trainer_username") String trainerUser,@PathVariable("trainer_password") String trainerPwd) {
		return service.trainerlogin(trainerUser,trainerPwd);
		
	}
	@GetMapping("student/{student_username}/{student_password}")
	public String studentlogin(@PathVariable("student_username") String studentUser,@PathVariable("student_password") String studentPwd) {
		return service.studentlogin(studentUser,studentPwd);
		
	}
}
