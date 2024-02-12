package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//NOTE-> Here we are using annotation for object life cycle.

public class Example {
		private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Starting the method..");
	}
	
	@PreDestroy
	public void ending()
	{
		System.out.println("ending the method..");
	}
	
	/* by default @PostConstruct and @PreDestroy are disabled and to enable
	 * it we have used <context:annotation-config/> in the configuration file
	 * <context:annotation-config/> enabels all the annotations.
	 */
}
