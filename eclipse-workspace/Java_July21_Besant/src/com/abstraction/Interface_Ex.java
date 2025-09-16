package com.abstraction;

public class Interface_Ex {

	public static void main(String[] args) {
	
		Vehicle v = new Car();
		v.start();
		v.stop();

	}

}

interface Vehicle {
	 void start(); // default method
	 void stop();
}

interface Transport {
	void colour();
}

class Car implements Vehicle , Transport {
	
	public void start() {
		System.out.println("Car starts");
	}

	public  void stop() {
		System.out.println("Car stops");
	}
	
	public void colour() {
		System.out.println("car colour ");
	}

}


// 29/08/2025