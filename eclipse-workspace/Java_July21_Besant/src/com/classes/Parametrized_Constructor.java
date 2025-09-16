package com.classes;

public class Parametrized_Constructor {

	public static void main(String[] args) {
		
		
		Bike b1 = new Bike("Activa", 2);
		b1.display();
        
		Bike b2 = new Bike("Hero", 2);
		b2.display();
	}

}

class Bike {
	int tyres;
	String model; 
	
	public Bike(String m, int tyre) {
		this.model = m;
		this.tyres = tyre;
	}
	
	public void display() {
		System.out.println(tyres + "  " + model);
	}
}

// line  no 21 - parametrized constructor