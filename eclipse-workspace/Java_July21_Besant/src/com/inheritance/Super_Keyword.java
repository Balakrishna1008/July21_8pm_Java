package com.inheritance;

public class Super_Keyword {

	public static void main(String[] args) {
          
//	Vehicless v = new Vehicless();
//    v.display();
		
		System.out.println("creating car with no-arg cons");
        Car c = new Car();
         
        System.out.println("\n creating car with parametrizes cons");
        Car c1 = new Car("green" , 4);
         
        
	}

}

class Vehicless {
	int tyres = 2;
	
		Vehicless() {
		System.out.println(" I am  vehichle class");
		}
		
		Vehicless(int tyres ) {
			System.out.println(" I am  vehichle class and number of tyres " + tyres);
			
		}
		
		
	
//	public void display() {
//		System.out.println("the number of tyres "  + tyres);
//	}
}

class Car extends Vehicless {
	
	String colour;
	// int tyres = 4;
	
	Car() {
       super(); // it is calling the super class constructor
		System.out.println(" i am a child class");
	}
	
	Car(String colour , int tyres) {
		super(tyres);
		System.out.println("child para const colour " + colour+ " " + tyres);
	}
	
	
	
//	public void show() {
//	System.out.println("child class");
 //   System.out.println("The colour of the car is " + colour);
   // System.out.println("the value of tyre from child class " + this.tyres); // calling the child class variable
  //  System.out.println("the value of tyre from parent class " + super.tyres); // calling the parent class variable
    
   //    super.display(); // calling the parent class method
//	}
}

// 21/08/2025
