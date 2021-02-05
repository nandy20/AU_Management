package com.acc.au.service.impl;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;



public class EmailJob implements Job{
	@Autowired
    private JavaMailSender emailSender;
	public void execute(JobExecutionContext context) throws JobExecutionException {
		System.out.println("Job1 --->>> Time is " + new Date());
		 final String fromEmail = "ravikumarmediaproductions@gmail.com"; //requires valid gmail id
		  final String password = "nandy.2008"; // correct password for gmail id
		 
		  Authenticator auth = new Authenticator() {
				//override the getPasswordAuthentication method
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(fromEmail, password);
				}
		  };
		  
		  Properties props = new Properties();
		  props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		  props.put("mail.smtp.port", "587"); //TLS Port
	      props.put("mail.smtp.auth", "true"); //enable authentication
		  props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
			try {
		  Session session = Session.getInstance(props, auth); 
		MimeMessage msg = new MimeMessage(session);
		  
	      //set message headers
	      msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
	      msg.addHeader("format", "flowed");
	      msg.addHeader("Content-Transfer-Encoding", "8bit");

	      msg.setFrom(new InternetAddress("ravikumarmediaproductions@gmail.com", "NoReply-JD"));

	      msg.setReplyTo(InternetAddress.parse("nandhiniraja208@gmail.com", false));

	      msg.setSubject("sdfsdfdf", "UTF-8");

	      msg.setText("sfsdfsfd", "UTF-8");

	      msg.setSentDate(new Date());

	      msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("nandhiniraja208@gmail.com", false));
    	   
  	  Transport.send(msg);  
			}catch(Exception e) {
				
			}
		

	      System.out.println("EMail Sent Successfully!!");
	} 
}
