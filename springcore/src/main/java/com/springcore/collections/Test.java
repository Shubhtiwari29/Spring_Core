package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
			ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
			Employee employee = (Employee) context.getBean("employee1");
			System.out.println(employee.getEmployeeName());
			System.out.println(employee.getPhoneNumbers());
			System.out.println(employee.getEmployeeAdresses());
			System.out.println(employee.getCourses());
	
	}

}
