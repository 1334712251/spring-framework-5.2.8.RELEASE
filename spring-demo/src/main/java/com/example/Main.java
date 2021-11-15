package com.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-test.xml");

		UserServer userServer = (UserServer) context.getBean("userServer");


		User user = userServer.gerUserById();

		System.out.println(user);
	}
}
