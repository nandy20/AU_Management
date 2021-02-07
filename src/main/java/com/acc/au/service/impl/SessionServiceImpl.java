package com.acc.au.service.impl;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.acc.au.model.Batch;
import com.acc.au.model.Session;
import com.acc.au.model.Trainer;
import com.acc.au.repository.SessionRepo;
import com.acc.au.service.SessionService;
import com.acc.au.service.TrainerService;
@Service
public class SessionServiceImpl implements SessionService{

	@Autowired
	SessionRepo repo;
	@Autowired
	TrainerService trainSer;
	
	@Autowired
    private JavaMailSender emailSender;
	@Override
	public String save(Session obj) {
		
		repo.save(obj);
		try {
			LocalDateTime local 
	        = LocalDateTime 
	              .parse(obj.getEnd_time()); 
			 ZonedDateTime dateTime = ZonedDateTime.of(local,ZoneId.systemDefault());
	            
			JobDetail job1 = JobBuilder.newJob(EmailJob.class)
					.withIdentity(UUID.randomUUID().toString(), "email-jobs")
					.build();

			Trigger trigger1 = TriggerBuilder.newTrigger()
					.withIdentity(job1.getKey().getName(),"email-triggers")
					  .startAt(Date.from(dateTime.toInstant()))
					.withSchedule(SimpleScheduleBuilder.simpleSchedule().withMisfireHandlingInstructionFireNow())
	                .build();
			
			Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
			scheduler1.start();
			scheduler1.scheduleJob(job1, trigger1);
			Thread.sleep(100000);
			scheduler1.shutdown();
			}catch (Exception e) {
				e.printStackTrace();
			}
		
		Optional<Trainer> t=trainSer.fetch(obj.getTrainerid());
		if(t.isPresent()) {
			SimpleMailMessage message = new SimpleMailMessage();
	        message.setFrom("nandhiniraja208@gmail.com");
	        message.setTo(t.get().getTrainer_email()); 
	        message.setSubject("Welcome to AU2021"); 
	        message.setText("You are added to the session");
	        emailSender.send(message);
	        
		}
		return "success";
	}
	@Override
	public Optional<Session> fetch(Integer id) {
		return repo.findById(id);
	}
	@Override
	public List <Session> fetchByBatch(Integer batchid) {
		// TODO Auto-generated method stub
		return repo.findByBatchid(batchid);
	}
	@Override
	public List<Session> fetchByTrainer(Integer trainerid) {
		// TODO Auto-generated method stub
		return repo.findByTrainerid(trainerid);
	}
	
}
