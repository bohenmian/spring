package com.bohenmian.aop;

import com.bohenmian.aop.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@Test
	public void testAOP() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bohenmian/spring-aop.xml");
		UserService userService = context.getBean(UserService.class);
		userService.createUser("jack", 18);
		userService.queryUser();
	}

}
