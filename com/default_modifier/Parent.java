package com.default_modifier;

public class Parent {
	
	String job = "Farmer";
	public int age = 50;
	
	public void show() {
		System.out.println("Job : " + job + " age : "+ age);
	}
	
	void parent() {
		System.out.println("I'm from parent class");
	}

}
