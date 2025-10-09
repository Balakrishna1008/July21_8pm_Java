package com.innerclass;

public class Non_static_Ex {

	public static void main(String[] args) {
		
		Outer1 out = new Outer1();
		Outer1.Inner in = out.new Inner(); // object creation varies 
		in.show();
		
	}

}

class Outer1{
	
	private String name = "Krish";
	
	class Inner{
		void show() {
			System.out.println(name);
		}
	}
}