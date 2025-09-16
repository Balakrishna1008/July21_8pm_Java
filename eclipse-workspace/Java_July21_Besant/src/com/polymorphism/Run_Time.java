package com.polymorphism;

public class Run_Time {

	public static void main(String[] args) {
		
		 Animal a = new Animal();
        a.sound(); // method call
        
		Animal d = new Dog(); // Runtime decision : here creating the reference for the parent class but calling the child class
		d.sound();// method call
		
        Animal c = new Cat();   // Runtime decision : here creating the reference for the parent class but calling the child class
        c.sound(); // method call
	}

}
class Animal {
	void sound() {
		System.out.println("Animal makes sound");
	}
	
}

class Dog extends Animal {
	@Override
	void sound() {
		
		System.out.println("Dog barks");
		
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		
		System.out.println(" Cat meows");
		
	}
}

// 29/08/2025
