package com.bohenmian.ioc;

import com.bohenmian.ioc.service.MessageService;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	@Test
	public void testApplicationContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bohenmian/spring-ioc.xml");
		MessageService messageService = (MessageService) context.getBean("messageService");
		System.out.println(messageService.getMessage());

		//	另外一种初始化IOC容器的方式
//		ClassPathResource resource = new ClassPathResource("com/bohenmian/spring-ioc.xml");
//		DefaultListableBeanFactory listableBeanFactory = new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(listableBeanFactory);
//		reader.loadBeanDefinitions(resource);

	}

}
