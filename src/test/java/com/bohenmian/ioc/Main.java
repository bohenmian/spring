package com.bohenmian.ioc;

import com.bohenmian.ioc.service.MessageService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@Test
	public void testApplicationContext() {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/bohenmian/spring-ioc.xml");

		MessageService messageService = (MessageService) context.getBean("messageService");

		System.out.println(messageService.getMessage());

	}

}
