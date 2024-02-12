package com.springcore.lifecycle;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		context.registerShutdownHook();
		
		// Note with the help of registerShutdownHook() spring container will call destroy method[defined in the Bean/pojo]
		// and in the xml file we have mentioned the name of destroy method.
		System.out.println("Spring Container maintaining Object Life cycle using XML configuration");
		Samosa samosaObject = (Samosa) context.getBean("s1");
		System.out.println();
		System.out.println(samosaObject);
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		System.out.println();
		System.out.println("Spring Container maintaining Object Life cycle using an Interface");
		System.out.println();
		Pepsi pepsiObject = (Pepsi) context.getBean("p1");
		System.out.println(pepsiObject);
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		System.out.println();
		Example exampleObject = (Example) context.getBean("e1");
		System.out.println(exampleObject);
		
	}

}
