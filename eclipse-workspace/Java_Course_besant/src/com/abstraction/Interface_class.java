package com.abstraction;

public class Interface_class {

	public static void main(String[] args) {

		Transport v = new Car();
		
		v.start();
		v.stop();
		
		v.color();
		
		
	}

}

interface Vehicles{
	void start();
	void stop();
	
}

interface Transport extends Vehicles{
	void color();
}

class Car implements Vehicles, Transport{

	@Override	
	public void start() {
		System.out.println("Car Starts");
		
	}

	public void stop() {
		System.out.println("Car Stops");
	}
	
	public void color() {
		System.out.println("Blue in color");
	}
}