package com.collection;

public class AutoBoxing_Unboxing_Ex {

	public static void main(String[] args) {
		
		//Auto-boxing
		int num = 23;
		Integer obj = Integer.valueOf(num);
		System.out.println(obj);
		
		// Un-boxing
		Integer obj1 = 22;
		int b = obj1;
		System.out.println(b);
		
	}

}
