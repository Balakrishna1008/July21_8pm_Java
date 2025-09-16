package com.ObjInit;

public class Ref_Var {

	public static void main(String[] args) {
	 
		Car c1 = new Car(); // object creation
		c1.year =  2022;  // Assigning value for object
		c1.colour = " Black"; // Assigning value for object
		
		c1.disply(); // calling the disply method
	}

}

// Object creation
 
class Car {
	
	String colour; // variable creation
	int year;   // variable creation
	
	public void disply() {   // method creation
		
		System.out.println(colour + "  "  + year); // printing the variable
	}
	
}


// here two reference variables are used - year and colour 
// scenario - intializing the object via refrence variable

// Day 16 -  11/08/2025