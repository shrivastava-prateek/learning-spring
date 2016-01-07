package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.EmployeeInfo;
import com.pojo.MyCompany;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MyCompany mycomp = (MyCompany)context.getBean("comp");
		mycomp.showCompanyInfo();
		
		EmployeeInfo emp = (EmployeeInfo)context.getBean("emp");
		emp.showEmp();
	}

}
