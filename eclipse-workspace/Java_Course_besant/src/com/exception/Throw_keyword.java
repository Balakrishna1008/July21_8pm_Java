package com.exception;

public class Throw_keyword {

	public static void main(String[] args) {
		
		try {
			checkMarks(45);
		}catch(Exception e){
			System.out.println(e);
		}
		

	}
	
	public static void checkMarks(int marks) {
		if(marks<35) {
			throw new ArithmeticException("You failed");
		}
		else {
			System.out.println("You passed");
		}
	}
}
