package com.exception;

public class Ex2 {

	public static void main(String[] args) {
		
	  // NullPointerException
		try {
			String text1 = null; //  Nullpointer exception
			System.out.println(text1.length());
			}catch (NullPointerException e) {
			System.out.println(e);
		}
		
      System.out.println("Exception resolved");
		
		// Arithmetic exception
      
      int a = 5;
      int b = 0;
      try {
    	  int c = a/b;
    	  System.out.println(c);
      }catch(ArithmeticException e) {
    	  System.out.println(e);
      }
   

	}

}
// 9/09/2025