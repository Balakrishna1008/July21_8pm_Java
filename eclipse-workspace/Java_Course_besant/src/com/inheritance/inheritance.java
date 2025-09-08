package com.inheritance;


class animal {
	int legs=4;
	String color = " ";
	
	public void show() {
		System.out.println(legs + " " + color);
	}
}

class dog extends animal{
	
	String breed = " ";
	
	public void display() {
		System.out.println(" "+ legs + "\n" + breed + "\n" + color);
	}
}


public class inheritance {
	public static void main(String arg[]) {
		
		dog obj = new dog();
		obj.color = " Red";
		obj.breed = " Labradour";
		obj.show();
		obj.display();
	}
}