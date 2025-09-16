package com.exception;

public class Exception_Ex1 {

	public static void main(String[] args) {
		
		System.out.println("hi");
		
	//	int arr[] = new int[5];
	//	arr[7] = 89;
	//	System.out.println(arr[7]);
		
		int c = 90; int d = 0;
		
		
		
		try {
			int result = c/d; // Arithmetic exception
			int arr[] = new int[5];
			arr[7] = 89; // ArrayIndexOutofBoundException
			System.out.println(arr[7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			
		}catch(ArithmeticException e) {
			System.out.println(e);		
		}finally {
			System.out.println("i am finally block");
		}
		
		System.out.println("Thank you");

	}

}

// 8/09/2025