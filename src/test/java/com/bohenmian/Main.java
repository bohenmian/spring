package com.bohenmian;

import com.bohenmian.service.MessageService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@Test
	public void testApplicationContext() {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bohenmian/application.xml");

		MessageService messageService = (MessageService) context.getBean("messageService");

		System.out.println(messageService.getMessage());

	}

}
