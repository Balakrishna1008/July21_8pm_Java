package com.strings;

public class String_Ex {

	public static void main(String[] args) {

		String S1 = "Welcome ";
//		S1 = S1 +"Students";                 // creates new student object --
//		S1 = "Welcome " + "Students";
//		System.out.println(S1);
		
		S1 = S1.concat("Students");
		System.out.println(S1);
	}

}
