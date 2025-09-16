package com.exception;

public class Custom_Exception_Handling {

	public static void main(String[] args) {
		try {
			eligibility(12); 
		} catch(CheckEligibility e) {
			System.out.println(e);
		}

	}

	public static void eligibility( int age) throws  CheckEligibility{
		if (age<18) {
			 System.out.println("not eligible to vote");
			  throw new CheckEligibility ("minor ");
		 }else {
			 System.out.println("eligible");
		 }
	}
}


class CheckEligibility extends RuntimeException {
	public CheckEligibility(String message) {
		super(message);
	}
}

// 10/09/2025