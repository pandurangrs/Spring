package com.springcore.autowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringTestClass {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowireAnnotation/autowiringConfig.xml");
		
//		Emp emp=(Emp)context.getBean("emp1");
		
		Emp emp=context.getBean("emp1",Emp.class);
		
		System.out.println(emp.getAddress().getCity());
		System.out.println(emp.getAddress().getStreet());
		System.out.println(emp);
	}
}
