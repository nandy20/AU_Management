package com.acc.au.service.impl;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

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
		/*try {
		LocalDateTime local 
        = LocalDateTime 
              .parse("2021-02-04T17:43:00"); 
		 ZonedDateTime dateTime = ZonedDateTime.of(local,ZoneId.systemDefault());
            
		JobDetail job1 = JobBuilder.newJob(EmailJob.class)
				.withIdentity(UUID.randomUUID().toString(), "email-jobs").build();

		Trigger trigger1 = TriggerBuilder.newTrigger()
				.withIdentity(job1.getKey().getName(),"email-triggers")
				  .startAt(Date.from(dateTime.toInstant()))
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withMisfireHandlingInstructionFireNow())
                .build();
		
		Scheduler scheduler1 = new StdSchedulerFactory().getScheduler();
		scheduler1.start();
		scheduler1.scheduleJob(job1, trigger1);
		scheduler1.shutdown();
		}catch (Exception e) {
			e.printStackTrace();
		}*/
		SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("nandhiniraja208@gmail.com");
        message.setTo(obj.getTrainer_email()); 
        message.setSubject("Welcome to AU2021"); 
        message.setText("You are added to the Au2021 Trainers List");
        emailSender.send(message);
		
		
		return "success";
	}
	@Override
	public Optional<Trainer> fetch(Integer id) {
	
		return repo.findById(id);
	}
	@Override
	public List<Trainer> fetchall() {
		
		return repo.findAll();
	}

	
	
}
