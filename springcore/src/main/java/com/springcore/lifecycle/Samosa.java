package com.springcore.lifecycle;

/*NOTE-> Here this is an example of how spring container works i.e life cycle of Object
creation - object initilization -Object detroy using xml configuration using init() and destroy()*/

public class Samosa {
	
		public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

		private double price;

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			System.out.println("Setting Samosa price");
			this.price = price;
		}

		public Samosa(double price) {
			super();
			this.price = price;
		}

		@Override
		public String toString() {
			return "Samosa [price=" + price + "]";
		}
		
		public void init()
		{
			System.out.println("In the Samosa init method");
		}
		
		public void destroy()
		{
			System.out.println("In the Samosa destroy method");
		}
}
