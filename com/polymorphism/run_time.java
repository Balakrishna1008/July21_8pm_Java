package com.polymorphism;

public class run_time {

	public static void main(String[] args) {

		Animal a = new Animal();
		a.sound();
		
		//creating reference and object in separate line
		Animal d ;
		d = new Dog();
		d.sound();
		
		Animal l = new Lion();
		l.sound();
		

	}

}


class Animal{
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal{
	void sound() {
		System.out.println("Dog is barking");
	}
}

class Lion extends Animal{
	void sound() {
		System.out.println("Lion is roaring");
	}
}
