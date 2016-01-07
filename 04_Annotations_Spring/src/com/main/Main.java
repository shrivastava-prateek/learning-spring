package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myimpl.MyImplementation;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context  = new ClassPathXmlApplicationContext("beans.xml");
		MyImplementation imp=(MyImplementation)context.getBean("MyImpl");
		System.out.println(imp);
	}

}
