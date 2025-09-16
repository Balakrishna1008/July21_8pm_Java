package com.classes;

public class Ex {

	public static void main(String[] args) {
	   
		car c1 = new car(); // default constructor , object creation
		c1.model = "Honda";
		c1.tyres = 4;
		c1.display();
		
		car c2 = new car();
		c2.model = "BMW";
		c2.tyres = 4;
		c2.display();

	}

}


class car {
	int tyres;
	String model; 
	
	public void display() {
		System.out.println(tyres + "  " + model);
	}
}


// Not even creating the constructor name is called as a default constructor