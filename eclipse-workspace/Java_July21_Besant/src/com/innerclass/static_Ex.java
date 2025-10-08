package com.innerclass;

public class static_Ex {

	public static void main(String[] args) {
		// with help of inner class we can access the private variable of outer class
		Outer.Inner inner = new Outer.Inner();
		inner.show();
		
	}

}

class Outer{
	
	static String message = "Hello";
	
	static class Inner{
		void show() {
			System.out.println(message); // for static inner class, only static variables can be accessed
		}
	}
}
