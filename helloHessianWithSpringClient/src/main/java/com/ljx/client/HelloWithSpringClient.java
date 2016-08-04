package com.ljx.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ljx.interfaces.IHello;

public class HelloWithSpringClient {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-client.xml");
		IHello hello = (IHello) context.getBean("helloService");
		String greetingMessage = hello.sayHello("Alpha");
		System.out.println("The greeting message is : " + greetingMessage);
	}
}
