package com.ljx.client;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ljx.interfaces.IHello;
import com.ljx.interfaces.IUserService;
import com.ljx.model.User;

@SuppressWarnings("resource")
public class TestHelloWithSpringClient {
	
	@Test
	public void testHello() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");
		IHello hello = (IHello) context.getBean("helloService");
		String greetingMessage = hello.sayHello("Alpha");
		System.out.println("The greeting message is : " + greetingMessage);
	}
	
	@Test
	public void testUser() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");
		IUserService user = (IUserService) context.getBean("userService");
		User u = user.getUser();
		System.out.println(u.toString());
	}
}
