package com.collection;

import java.util.*;

public class TreeSet_Ex {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<>();
		
		 numbers.add(10);
	     numbers.add(5);
	     numbers.add(20);
	     numbers.add(10);
	     numbers.add(0);
	     System.out.println(numbers);    
	     // It will arrange the elements in ascending order and avoids the duplicates
	     
//	     numbers.add(null);
	     System.out.println(numbers);

	     TreeSet<String> names = new TreeSet<>();
			
		 names.add("krish");
	     names.add("bala");
	     names.add("balakrish");
	     names.add("ajai");
	     System.out.println(names);
	     
//	     names.add(null);
	     System.out.println(names);
	     
	     System.out.println(names.first()); // returns the first element
	     System.out.println(names.last()); // returns the last element
	     
	     System.out.println(names.lower("bala")); // returns the previous element 
	     System.out.println(names.higher("balakrish")); // returns the next element
	     
	     System.out.println(names.pollFirst()); // returns first element
	     System.out.println(names.pollLast()); // returns last element
	     
	     System.out.println(names.floor("balakrish")); // returns the previous greater element if present or else returns the same element
	     System.out.println(names.ceiling("")); // returns the next element if present or else returns the same element
	     
	}

}

