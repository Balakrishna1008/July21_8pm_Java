package com.exception;

public class Stack_ex {

	public static void main(String[] args) {
		Stack_ex sc = new Stack_ex();
		sc.methodA();

	}
	
	public void methodA() {
		System.out.println("Method A");
		
		try {
			methodB();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public void methodB() 
	{
		System.out.println("Method B");
		int c = 5/0;
		System.out.println(c);
	}

}
