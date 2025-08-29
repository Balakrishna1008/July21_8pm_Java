package com.access_modifiers;

public class Access_modifiers {

	public static void main(String[] args) {
		Car1 c1 = new Car1( 2021, "Black");
		c1.show(2015, "Green");
		
	}

}


class Car1 {
	int year = 2021;
	String color = "Red";
	

	Car1(int year, String color) 
	{
//		this.color = color;
//		this.year = year;	
//		
		System.out.println(color + " " + year);
	}


	public void show(int year, String color) 
	{
		System.out.println(year+ " "+color);
	}
}


