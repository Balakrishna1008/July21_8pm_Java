package com.classes;

public class NoArg_Constructor {

	public static void main(String[] args) {
		
		Books b1 = new Books();
		b1.show();
		
		Books b2 = new Books();
		b2.name = "Java";
		b2.price = 520.50;
		b2.show();
				

	}

}

class Books{
	
	String name;
	double price;
	
	Books() {     // No argument constructor
		
	}
	
	public void show() {
		System.out.println("The name of the book is " + name + "the price is " + price);
	}
	
}

// line no 25 - No arguments constructor