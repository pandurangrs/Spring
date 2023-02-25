package com.springcore.collectionRef;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collection.Emp;

public class TestCollectionRef {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collectionRef/collectionRef.xml");
	
	Test test=context.getBean("test",Test.class);
	
	System.out.println(test);
}
}
