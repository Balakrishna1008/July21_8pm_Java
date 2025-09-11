package com.exception;

public class Throws_Keyword {

	public static void main(String[] args) {
		try {
			checkEligibilty(8);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void checkEligibilty(int age) throws ArithmeticException {
		if(age < 18) {
			
			System.out.println("You are not eligible");
			throw new ArithmeticException("Not eligible");
			
		}else {
			System.out.println("Eligible");
		}
	}
}
