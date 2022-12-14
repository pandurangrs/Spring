package com.springcore.lifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifeCycle/lifeCycleConfig.xml");

		//registering shutdown method
		context.registerShutdownHook();
		
		
//		Samosa s1 = (Samosa) context.getBean("s1");
//		System.out.println(s1);
//		
//
//		
//		
//		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//		Pepsi p1=(Pepsi)context.getBean("p1");		
//		System.out.println(p1);
		
		Example e1 = (Example)context.getBean("e1");
		
		System.out.println(e1);
		
	}
}
