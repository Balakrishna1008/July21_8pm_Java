package com.inheritance;

public class Single_Level {

	public static void main(String[] args) {
	
		Vehicle v = new Vehicle();
		v.display();
		
		

		Bike b = new Bike();
		b.tyres = 2;
		b.model = "Duke";
		b.show();
		b.display();
		
		
		
		
	     
	}

}
class Vehicle {
	int tyres = 4;
	String model;

	public void display() { // method overriding
		System.out.println(" I am display from child class,The model of the vehicle from parent class is " + model + " " + tyres);
	}
	
	
}
class Bike extends Vehicle{
	
	int year = 2015;
	
	public void show() {
		System.out.println("The child class value " + year + " " + tyres+ " " + model);
	
		
	}
	
	@Override
	public void display() {  // method overriding
		System.out.println("I am display from child class"); 
	}
	
	
	
	
}

// 19/08/2025 - actual single level inheritance code in notepad 
// 26/08/205 - Method overriding