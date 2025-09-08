package com.polymorphism;

public class compile_time {

	public static void main(String[] args) {
		
		
		Operations o = new Operations();
		
		int result1 = o.addition(3, 6);
		System.out.println(result1);
		
		int result2 = o.addition(3, 6, 8);
		System.out.println(result2);
		

	}

}

class Operations{
	
	int addition(int a, int b) {
		return a+b;
	}
	
	int addition(int a, int b, int c) {
		return a+b+c;	
	}
}