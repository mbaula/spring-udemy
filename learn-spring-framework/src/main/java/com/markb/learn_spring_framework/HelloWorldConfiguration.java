package com.markb.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age, Address address) {};
record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Mark";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Jack", 24, new Address("Main St", "Berlin"));
		return person;
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address2) {
		return new Person(name, age, address2);
	}
	
	@Bean (name="address2")
	public Address address() {
		var address = new Address("1 University", "London");
		return address;
	}
}
