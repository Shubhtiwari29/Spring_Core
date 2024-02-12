package com.springcore.constructorinjection;

public class Addition {
	
	private int a;
	private int b;
	
	
	/* Note-> Here the flow (order) is top to bottom, means whichever constructor is written
	 * first will be called. Here constructor : double, double will get called.
	 * Spring always consider type of argument as String (unless you mention explicitly), 
	 * So if there's a constructor which accepts String type arguments in this case preference given to that constructor only.	
	 */
	
	public Addition(double a, double b)
	{
		this.a= (int)a;
		this.b=(int)b;
		System.out.println("constructor : double, double");
	}
	
	public Addition(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("constructor : int, int");
	}
	
	public Addition(String a, String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("constructor : String, String");
	}
	
	public void doSum()
	{
		System.out.println("value of a : "+this.a);
		System.out.println("value of b : "+this.b);
		System.out.println("Sum is "+(this.a+this.b));
	}
}
