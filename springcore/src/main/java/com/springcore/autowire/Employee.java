package com.springcore.autowire;

public class Employee {
	
		private Address addressObject; //NOTE-> name of the variable i.e addressObject and it's Address type. and bean name in the xml file must be same.

		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Address getAddressObject() {
			return addressObject;
		}

		public Employee(Address addressObject) {
			super();
			this.addressObject = addressObject;
			System.out.println("Inside constructor..");
		}

		public void setAddressObject(Address addressObject) {
			System.out.println("Setting Values..");
			this.addressObject = addressObject;
		}
		
		@Override
		public String toString() {
			return "Employee [addressObject=" + addressObject + "]";
		}
}
