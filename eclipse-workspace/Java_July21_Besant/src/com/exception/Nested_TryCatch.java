package com.exception;

public class Nested_TryCatch {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("I am from outer try block");
			
			
			   int a = 5;
			   int b = 0;
			try {
				int c = a/b;
		    	  System.out.println(c);
			}catch(ArithmeticException ex) {
		    	  System.out.println(ex);
		      }
			

			try {
				
				int arr[] = new int[5];
				arr[7] = 89; // ArrayIndexOutofBoundException
				System.out.println(arr[7]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				
			  }
			
			}catch(Exception e) {
			System.out.println(e);
			System.out.println(" I am from catch block");
		}

	}

}


// 9/09/2025
