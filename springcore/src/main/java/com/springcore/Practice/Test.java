package com.springcore.Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Practice/practiceConfig.xml");
	Employee bean = context.getBean("emp",Employee.class);
	
	System.out.println(bean);
	
}
}
