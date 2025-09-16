package com.methods;

public class Method_Ex {

	public static void main(String[] args) {
		System.out.println("hi");
		double c = add(4.5,2.6); 
		System.out.println(c);// method call
		System.out.println(add(1,5)); // method call
		
		Method_Ex obj = new Method_Ex(); // object creation
		obj.display(); //method call
		
		
	}

	
	public static double add(double a , double b) {  // method creation
		return a + b;
	}
	
	public static void print() {
		System.out.println("Printed");
		System.out.println("tips");
	}
	
	public void display() {
		System.out.println("displaying");
		System.out.println("goat");
		print();
	}
}

// - this file is  explanation about the static method creation and calling the static method

// Day 13 - 6/08/2025
