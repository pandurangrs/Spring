package com.springcore.stereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotype {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereoType/stereoTypeConfig.xml");
		Student student = context.getBean("ob",Student.class);
		
//		System.out.println(student);
//		System.out.println(student.getAddress());
//		System.out.println(student.getAddress().getClass());
		
		//Singltone
//		System.out.println(student.hashCode());				
//		Student student1 = context.getBean("ob",Student.class);
//		System.out.println(student1.hashCode());
		
		//prototype
		Teacher teacher = context.getBean("teacher",Teacher.class);
		System.out.println(teacher);
		
		Teacher teacher1 = context.getBean("teacher",Teacher.class);
		System.out.println(teacher1);
	}
}
