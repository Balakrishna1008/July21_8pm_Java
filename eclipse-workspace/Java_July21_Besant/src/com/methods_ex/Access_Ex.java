package com.methods_ex;

public class Access_Ex {

	public static void main(String[] args) {
	greet();
		
}		
		private static void greet() {
		System.out.println("Good evening");	
		}
		
	}


class sample{
	public static void show() {
		System.out.println("Showing");
	
		
	}
}

// if the method is declared as private , we cannot call inside the another class , it can be called in the same class only.

// topic discussed here - private access modifier