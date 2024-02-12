package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneconfig.xml");
	
		 Person personObject = context.getBean("person",Person.class);
		 	
		 	System.out.println(personObject);
		 	System.out.println(personObject.getFriends().getClass().getName());
		 	System.out.println();
		 	System.out.println(personObject.getFeestructure());
		 	System.out.println(personObject.getFeestructure().getClass().getName());
		 	System.out.println();
		 	System.out.println(personObject.getProperties());
	}

}
