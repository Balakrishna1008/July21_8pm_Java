package com.collection;

import java.util.*;

public class Map_HashMap {

	public static void main(String[] args) {
		
		Map<Integer, String> student = new HashMap<>();
		
		student.put(1,"Bala");
		student.put(2,"balakrish");
		student.put(3,"krish");
		student.put(4,"Chennai");	
		student.put(5,"Unemployed");
		student.put(5,"Employed"); // if we give same keys, it will return the recent most value
		
		System.out.println(student);
		System.out.println(student.remove(4));
		
		System.out.println(student.remove(2,"balakrish"));
		System.out.println(student);
		
		System.out.println(student.get(1)); // returns the value for the key
		System.out.println(student.containsKey(3)); // return boolean value for condition
		System.out.println(student.containsValue("chennai")); // It's case-sentivie, so it will return false 
	
		student.replace(3,"23");
		System.out.println(student);
	}

}
