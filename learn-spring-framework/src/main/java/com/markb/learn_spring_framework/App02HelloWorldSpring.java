package com.markb.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1. Launch Spring context
		
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2. Configure things we want Spring to manage - @Configuration
		// HelloWorldConfiguration - @Configuration
		// name - @Bean
		
		// 3. Retrieve beans managed by Spring
		System.out.println(context.getBean("name"));
		
	}

}
