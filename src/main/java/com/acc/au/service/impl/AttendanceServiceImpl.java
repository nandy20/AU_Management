package com.acc.au.service.impl;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.acc.au.model.Attendance;
import com.acc.au.model.Session;
import com.acc.au.model.Student;
import com.acc.au.repository.AttendanceRepo;
import com.acc.au.service.AttendanceService;
import com.acc.au.service.SessionService;
import com.acc.au.service.StudentService;
@Service
public class AttendanceServiceImpl implements AttendanceService{

	@Autowired
	AttendanceRepo repo;
	@Autowired
	StudentService stuservice;
	@Autowired
	SessionService sessservice;

	@Autowired
    private JavaMailSender emailSender;
	@Override
	public String save(Attendance obj) {
		
		repo.save(obj);
		Optional<Student> stu=stuservice.fetch(obj.getStudent_id());
		Optional<Session> sess=sessservice.fetch(obj.getSession_id());
		if(stu.isPresent()) {
			SimpleMailMessage message = new SimpleMailMessage(); 
	        message.setFrom("nandhiniraja208@gmail.com");
	        message.setTo(stu.get().getStudent_email()); 
	        message.setSubject("Session Attendance"); 
	        message.setText("You are marked "+obj.getStatus()+" for the "+sess.get().getSession_name()+" session");
	        emailSender.send(message);
		}
		return "success";
	}

}
