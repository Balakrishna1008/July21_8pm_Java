package com.exception;

public class Custom_exceptionHandling {

	public static void main(String[] args) {
		try {
			eligibility(13);
		}catch(Exception e) {
			System.out.println(e.getMessage()); // getMessage() only returns the message inside the exception
		}
		
	}

	public static void eligibility(int age ) throws CheckEligibility{
		if(age < 18) {
			System.out.println("Not Eligibile");
			throw new CheckEligibility("Minor");
			
		}
		else {
			System.out.println("Eligibile to vote");
		}
	}
}

class CheckEligibility extends RuntimeException{
	public CheckEligibility(String message) {
		super(message);
	}
}