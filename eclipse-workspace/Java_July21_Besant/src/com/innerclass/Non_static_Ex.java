package com.innerclass;

public class Non_static_Ex {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner(); // object creation varies 
		inner.show();
		
	}

}

class Outer{
	
	private String name = "Krish";
	
	class Inner{
		void show() {
			System.out.println(name);
		}
	}
}