package com.example.tutorial.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutorial.mail.MailSender;
import com.example.tutorial.mail.MockMailSender;

@RestController
public class MailController {
	
	
	public MailSender mailSender;
	
	
	public MailController(@Qualifier("smtpMail") MailSender smtp) {
		this.mailSender = smtp;
	}

	@RequestMapping("/mail")
	public String mail() {
		mailSender.send("mail@example.com", "subjects", "some Dummy body Example");
		return "Mail Send";
	}
}
