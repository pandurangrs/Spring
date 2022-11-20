package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collectionConfig.xml");
		
		Emp emp=(Emp)context.getBean("emp1");
		
		System.out.println(emp);
		System.out.println("+++++++++++++++++++++++");
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getCourse());
		System.out.println(emp.getProps());
		
	}
}
