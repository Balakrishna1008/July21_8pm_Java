package com.abstraction;

public class Abstract_class {
	
	public static void main(String args[]) {
	
		
		Animal a = new Dog();
		a.eat();
		a.sleep();
		
	}
}

abstract class Animal{
	public abstract void eat();
	
	public void sleep() {
		System.out.println("Sleeping");
	}
	
	Animal(){
		
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("Dog is eating");
	}
}