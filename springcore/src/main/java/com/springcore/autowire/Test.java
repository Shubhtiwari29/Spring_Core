package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowire/autowireconfig.xml");
	
	Employee employeeObject = context.getBean("employee",Employee.class);
//NOTE-> Earlier we used to type casting but here, we have provide the name of the bean i.e 1st argument and bean type i.e 2nd argument.
	System.out.println(employeeObject);
	}

}
