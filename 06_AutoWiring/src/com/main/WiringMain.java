package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiring.annotation.Employee1;

public class WiringMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee1 emplo= (Employee1)context.getBean("emp_annot");
		System.out.println(emplo);
	}

}
