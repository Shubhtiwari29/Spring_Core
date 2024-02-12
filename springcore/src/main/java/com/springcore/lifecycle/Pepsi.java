package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;

//Note -> Here we are using an interface for life cycle of object. 

import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean // InitializingBean gives us the afterPropertiesSet() and DisposableBean gives us the destroy(). 
{	
	private double price;

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}
	public void afterPropertiesSet() throws Exception // Basically this is a init(), which we have seen in the Samosa class. 	
	{
		System.out.println("Taking pepsi : init");	
	}
	public void destroy() throws Exception // This is exactly the destroy method which we have learned in the Samosa class.
	{
		System.out.println("pepsi finished");
	}
	
}
