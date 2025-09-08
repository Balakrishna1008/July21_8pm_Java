package com.inheritance;


// Multi-level inheritance ---

class Vehicle {
 void start() {
     System.out.println("   Vehicle starts   ");
     System.out.println("");
 }
}

class Car extends Vehicle {
 void drive() {
     System.out.println("   Car is driving   ");
     System.out.println("");
 }
}

class SportsCar extends Car {
 void turbo() {
     System.out.println("   SportsCar turbo activated!  ");
     
 }
}

//public class practice_sums {
//	
// public static void main(String[] args) {
////	 System.out.println("");
//     SportsCar sc = new SportsCar();
//     sc.start();   // from Vehicle
//     sc.drive();   // from Car
//     sc.turbo();   // from SportsCar
// }
//}


// Multiple inheritance ---

interface Engine {
 void engineType();
}


interface Wheels {
 void wheelType();
}


class Bike implements Engine, Wheels {
 public void engineType() {
	 System.out.println("");
     System.out.println("Bike has a 150cc Engine.");
 }

 public void wheelType() {
	 System.out.println("");
	 System.out.println("Bike has 2 wheels.");
 }
}

public class practice_sums {
 public static void main(String[] args) {
     Bike b = new Bike();
     b.engineType();
     b.wheelType();
 }
}

	
