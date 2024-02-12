package com.springcore.constructorinjection;

public class Certificate {
	
	public String name;

	public Certificate(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
	
		return this.name;
	}
	
	
}
