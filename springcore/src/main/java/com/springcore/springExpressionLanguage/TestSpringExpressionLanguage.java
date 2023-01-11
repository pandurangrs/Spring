package com.springcore.springExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSpringExpressionLanguage {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springExpressionLanguage/SpringExpressionLanguageConfig.xml");
		
		Demo demo = context.getBean("demo",Demo.class);
		System.out.println(demo);
		System.out.println(demo.getX());
		System.out.println(demo.getY());
		
		SpelExpressionParser temp = new SpelExpressionParser();
		Expression expression = temp.parseExpression("22+2");
		System.out.println(expression.getValue());
		
		System.out.println(demo.getName());
		
	}
}
