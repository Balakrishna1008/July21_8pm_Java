package com.strings;

public class String_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Hello Everyone";
		System.out.println("String : " + text);
		
		// string => buffer
		StringBuffer sb = new StringBuffer(text);
		System.out.println("StrinBuffer : " + sb);
		
		//string => builder
		StringBuilder sbd = new StringBuilder(text);
		System.out.println("StringBuilder : " + sbd);
		
		//buffer,builder => string
		StringBuilder sbd1 = new StringBuilder("Welcome to Java class");
		System.out.println("StringBuilder : " + sbd1);
		
		String s1 = sbd1.toString();
		System.out.println(s1);
		
		// string builder => string buffer
		StringBuilder sbd2 = new StringBuilder("Welcome to Java class");
		System.out.println("StringBuilder : " + sbd2);
		
		String s2 = sbd1.toString();
		System.out.println(s2);
		
		StringBuilder sb1 = new StringBuilder(s2);
		System.out.println("StringBuilder : " + sb1);
		
		
	}

}
