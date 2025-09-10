package com.exception;

public class Nested_try_catch {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("I'm from try outer block");
			int a=12,b=0;
			try {
				String text = null;
				System.out.println(text.length());

				int res=a/b;
				System.out.println(res);
			}
			catch(NullPointerException e) {
				System.out.println(e);
			}
			
			catch(Exception e) {
				System.out.println(e);
				System.out.println("I'm from inner catch block");
			}
			
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("I'm from outer catch block");
		}
		
	}

}
