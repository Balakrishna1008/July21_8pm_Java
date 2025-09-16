package com.exception;

public class Throws_Keyword {

	public static void main(String[] args) {
		
		checkEligibility(11);

	}
	
	public static void checkEligibility(int age) throws ArithmeticException {
		 if (age<18) {
			 System.out.println("not eligible to vote");
			  throw new ArithmeticException("not eligible ");
		 }else {
			 System.out.println("eligible");
		 }
	}

}

// 10/09/2025
