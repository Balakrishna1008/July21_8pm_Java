
package com.collection;

import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {

	public static void main(String[] args) {
		
		Set<String> courses = new HashSet<>();
		Set<String> courses1 = new HashSet<>();
		
		
		courses.add("HTML");
		courses.add("CSS");
		courses.add(null);
		courses.add("JS");
		courses.add("Java");
		courses.add("SQL");
		courses.add("CSS");
		courses.add(null );
		  
		System.out.println(courses);
		
		
		courses1.add("SQL");
		courses1.add("JS");
		courses1.add(null);
		courses1.add("CSS");
		courses1.add("Java");
		courses1.add("HTML");
		courses1.add("CSS");
		
		  
		System.out.println(courses1);
		
		//courses.remove("CSS");
		//System.out.println(courses);
		
	System.out.println(courses.equals(courses1));
	
	
	for(String c: courses) {
		System.out.println(c);
	}

	}

}

// 12/09/2025


