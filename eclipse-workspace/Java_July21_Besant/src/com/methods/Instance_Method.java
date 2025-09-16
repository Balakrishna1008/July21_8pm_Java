package com.methods;

public class Instance_Method {

	public static void main(String[] args) {
		
		Instance_Method ex = new Instance_Method();  // object creation
		//ex.greet(); // method call by using the object name
		
		 System.out.println(ex.sub(5, 4)); // method call
		 
		 Instance_Method tr = new Instance_Method();
		 tr.tree();

	}

	public void greet() {
		System.out.println("Greeting");
		System.out.println("boss");
		System.out.println("bospsss");
	}
	
	public int sub(int c , int d) {
		greet();
		
		return c - d;
	}
	
	public void tree() {
		System.out.println("gifer");
		System.out.println("frees");
		System.out.println("koko");
	}
	
}
