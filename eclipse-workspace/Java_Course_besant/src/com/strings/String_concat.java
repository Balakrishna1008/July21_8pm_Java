package com.strings;

public class String_concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fname = "Bala";
		String lname = "Krish";
		int age = 23;
		
//		String fullname = fname + lname;
		String fullname = fname.concat(lname);
		
		System.out.println(fullname);
		
		String result = fullname + age;
		System.out.println(result); // String and integer can be concat-inated --
		
		String text = "This is 'Java' class";
		String text1 = "This is \"Java\" class";
		String text2 = "This is \\Java\\ class";
		
		System.out.println(text);
		System.out.println(text1);
		System.out.println(text2);
		
	}

}
