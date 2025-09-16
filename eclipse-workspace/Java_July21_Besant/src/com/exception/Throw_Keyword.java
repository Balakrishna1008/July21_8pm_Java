package com.exception;

public class Throw_Keyword {

	public static void main(String[] args) {
	
		try {
			checkMarks(25);
			
		}catch(Exception ew) {
			System.out.println(ew);
		}

	}
	
	public static void checkMarks(int marks) {
		
		if(marks < 35) {
			throw new ArithmeticException(" you got fail mark ");
		}else {
			System.out.println("pass mark");
		}
	}

}

// 10/09/2025