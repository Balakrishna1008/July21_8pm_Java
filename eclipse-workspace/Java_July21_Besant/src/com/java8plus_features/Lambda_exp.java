package com.java8plus_features;

public class Lambda_exp {

	public static void main(String[] args) {
		
		Hi h = new Hi();
		h.sayHi();
		
		Greeting g = new Hi();
		g.sayHi();
		
		Greeting greet = ()-> System.out.println("hello");// avoiding the method name and using arrow 
		greet.sayHi();
		
		Add add = (a,b) -> a+b;
		System.out.println(add.sum(3, 4));
	}
}

@FunctionalInterface

interface Greeting{
	void sayHi();
}

class Hi implements Greeting{
	
	public void sayHi() {
		System.out.println("Hi");
	}
}

interface Add{
	int sum(int a, int b);
}