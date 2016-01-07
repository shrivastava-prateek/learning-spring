package com.log1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MyInterface emp=(MyInterface)context.getBean("student");
		int a= emp.add();
		int s= emp.sub();
	}

}
