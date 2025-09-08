package com.inheritance;

public class super_keyword {

	public static void main(String[] args) {
		
//		Vehicless v = new Vehicless();
//		v.display();

//		System.out.println("\ncreating car with no-arg cons");
		Cars c = new Cars("Blue",4);
		
//		System.out.println("\ncreating car with parameterised cons");
//		Cars c1 = new Cars("green", 4);
		c.show();
		
		
	}

}

class Vehicless{
	int tyres = 2;
	
	Vehicless(){
		System.out.println("i am vehicle class");
	}
	
	Vehicless(int tyres){
		System.out.println("i am vehicle class and number of tyres '" + tyres);
	}
	
	public void display() {
		System.out.println("the number of tyres " + tyres);
	}
}

class Cars extends Vehicless{
	
	String colour ;
	int tyres = 4;
	
	Cars(){
		super();
		System.out.println("\ni am from child class");
	}
	
	Cars(String colour, int tyres){
		super(tyres);
		this.colour = colour;
		System.out.println("child para const colour '" + colour + " and '" + tyres);
	}
	
	public void show() {
		System.out.println("\nChild class");
		System.out.println("\nThe colour of the car is " + colour);
		System.out.println("\nthe value of tyre from child class " + this.tyres);
		System.out.println("\nthe value of tyre from parent class " + super.tyres);
		
//		super.display();
	}
	
	
}