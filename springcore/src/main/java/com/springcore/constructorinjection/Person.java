package com.springcore.constructorinjection;

public class Person {

		private String personName;
		private int personId;
		private Certificate certificate;
		
		public Person(String personName, int personId, Certificate certificate)
		{
			this.personName = personName;
			this.personId = personId;
			this.certificate = certificate;
		}

		@Override
		public String toString() {
			
			return this.personName +" : "+ this.personId+" "+"{"+this.certificate.name+"}";
		}
		
}
