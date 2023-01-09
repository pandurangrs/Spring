package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollection {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneCollectionConfig.xml");
		Person person = context.getBean("person",Person.class);
		System.out.println(person);
		System.out.println(person.getFriends().getClass());
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println(person.getFeesStructure());
		System.out.println(person.getFeesStructure().getClass());
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		System.out.println(person.getProperties());
		System.out.println(person.getProperties().getClass());
		
//		Person person2 = context.getBean("person2",Person.class);
//		System.out.println(person2);
	}
}
