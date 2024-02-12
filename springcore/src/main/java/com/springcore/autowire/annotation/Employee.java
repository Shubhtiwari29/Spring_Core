package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//NOTE->We can use @Autowired at setter,constructor or at the property


public class Employee {
		@Autowired
		@Qualifier("addressObject1") // NOTE-> @Qualifier is used to choose any of the bean if there are multiple beans declared in the configuration file.
		private Address addressObject; //NOTE-> name of the variable i.e addressObject and it's Address type. and bean name in the xml file must be same.

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Address getAddressObject() {
			return addressObject;
		}
		//@Autowired
		public Employee(Address addressObject) {
			super();
			this.addressObject = addressObject;
			System.out.println("Inside constructor..");
		}
		//@Autowired
		public void setAddressObject(Address addressObject) {
			System.out.println("Setting Values..");
			this.addressObject = addressObject;
		}
		
		@Override
		public String toString() {
			return "Employee [addressObject=" + addressObject + "]";
		}
}
