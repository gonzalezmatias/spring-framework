package com.example.tutorial.mail;

import org.springframework.context.annotation.Configuration;

@Configuration 
public class MailConfig {

	public MailSender mockMailSender() {
		return new MockMailSender();
	}
	

	public MailSender smtpMailSender() {
		return new SmtpMailSender();
	}
}
