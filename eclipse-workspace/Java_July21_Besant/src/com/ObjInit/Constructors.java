package com.ObjInit;

public class Constructors {

	public static void main(String[] args) {
		
		Cars c1 = new Cars("Red",2025); // object creation
		 
		
		c1.disply(); 
		

	}

}

class Cars {
	
	String colour; // variable creation
	int year; // variable creation
	
	Cars(String colour, int yr) {   // constructor creation
		this.colour = colour; 
		this.year = yr;
	}
	
	public void disply() {
		System.out.println(colour + " " + year);
	}
}

// Day 16 - 11/08/2025