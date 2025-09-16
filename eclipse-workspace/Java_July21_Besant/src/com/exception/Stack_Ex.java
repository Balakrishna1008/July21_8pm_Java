package com.exception;

public class Stack_Ex {

	public static void main(String[] args) {
		
		Stack_Ex ex = new Stack_Ex();
		ex.methodA();

	}
	
	public void methodA() {
		
		System.out.println("method A");
		methodB();
	}
	
	public void methodB() {
		System.out.println("method B");
		
		try {
			int c = 5/0;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}

// here the code written is for CallStack example

// 9/09/2025
