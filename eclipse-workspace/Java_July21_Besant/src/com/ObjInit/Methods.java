package com.ObjInit;

public class Methods {

	public static void main(String[] args) {
	   Car1 c1 = new Car1(2014, "Red");
	   c1.show(2024, "White");

	}

}

class Car1{
	int year = 2018;
	String colour = "blue";
	
	Car1 (int year, String colour) {
		this.colour = colour;
		this.year = year;
		
		System.out.println(colour + "  " + year);
	}
	
	public void show(int year , String colour) {
		System.out.println(year + " " + colour);
	}
}

// Day 16 - 11/08/2025