package com.exception;

public class Exception_1 {

	public static void main(String[] args) {

		System.out.println("Hi");
		
		try 
		{
		int arr[] = new int[5];
		arr[3] = 33;
		System.out.println(arr[3]);
		}
		// catch block executes only when exception occurs -- 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		finally {
			System.out.println("This is Finally block");
		}
		
		System.out.println("End message");
	}

}
