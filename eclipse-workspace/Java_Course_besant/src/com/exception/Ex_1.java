package com.exception;

public class Ex_1 {

	public static void main(String[] args) {
		
		int a= 12, b= 0;
		try {
			
			int result = a/b;
			int arr[] = new int[5];
			arr[3] = 33;
			System.out.println(arr[3]);
			
		}
		
		// catch block executes only when exception occurs -- 
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		try {
			String text = null;
			System.out.println(text.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		
		finally {
			System.out.println("This is Finally block");
		}
		
		System.out.println("Thank you");
	}

}
