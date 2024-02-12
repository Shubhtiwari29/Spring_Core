package com.springcore.reference;

public class A {
	
	private int x;
	private B object;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getObject() {
		return object;
	}
	public void setObject(B object) {
		this.object = object;
	}
	public A(int x, B object) {
		super();
		this.x = x;
		this.object = object;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", object=" + object + "]";
	}
	
}
