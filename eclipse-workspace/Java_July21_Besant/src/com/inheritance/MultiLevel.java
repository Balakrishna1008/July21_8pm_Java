package com.inheritance;

public class MultiLevel {

	public static void main(String[] args) {
		
		Vehicles v = new Vehicles();
		v.display();

		Bikes b = new Bikes();
		b.tyres = 2;
        b.seats = 2;
		b.show();
		b.display();
		
		Duke d = new Duke();
		d.year = 2025;
		d.print();
		

	}

}

class Vehicles {
	int tyres = 4;
	int seats;
	
	public void display() {
		System.out.println("The model of the vehicle from parent class is " + seats + " " + tyres);
	}
}
class Bikes extends Vehicles{
	
	int year = 2015;
	
	public void show() {
		System.out.println("The child class value " + year + " " + tyres+ " " + seats);
		
	}
}

 class Duke extends Bikes {
	 
	 String colour = "black";
	 
	 public void print() {
		 System.out.println("Duke class : " + colour + " " + year + " " + tyres + " " + seats);
	 }
	 
 }
 
 
 //  19/08/2025