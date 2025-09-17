package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		// type of interface <datatype> var name = new class<>();  => Syntax to create interface and class
             
		numbers.add(14);
		numbers.add(89);
		numbers.add(100);
		numbers.add(52);
		numbers.add(45);
		numbers.add(45);
		
		numbers.add(1,23); // adding the element at the particular index
		System.out.println(numbers);
		
		numbers.remove(2);   // remove according to the index
		System.out.println(numbers);
		
		boolean isEmpty = numbers.isEmpty();  // to check the arraylist is empty or not
		System.out.println(isEmpty);
		
		boolean present = numbers.contains(23); // particular element is present or not
		System.out.println(present);
		
		int size = numbers.size(); // to get the size of the list
		System.out.println(size);
		
		int getIndex = numbers.get(4); // to get the element at the particular position
		System.out.println(getIndex);
		
		int indexOf = numbers.indexOf(45); // to find the particular element position(index)
		System.out.println(indexOf);
		
		
		int lastIndexof = numbers.lastIndexOf(45);
		System.out.println(lastIndexof);
		
		
		// iterate
		for(int i =0; i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		
		
	}

}



// 11/09/2025

