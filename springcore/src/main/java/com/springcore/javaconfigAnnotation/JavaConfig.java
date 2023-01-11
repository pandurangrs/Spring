package com.springcore.javaconfigAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfigAnnotation")
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa() {
		Samosa samosa=new Samosa();
		
		return samosa;
	}
	
		@Bean(name = {"student","temp","om"})
		public Student getStudent() {
			//creating a new student object
			Student sutdent=new Student(getSamosa());
			return sutdent;
			
		}
}
