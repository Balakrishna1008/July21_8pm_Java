package com.collection;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		// type of interface <datatype> var name = new class<>();
		
		numbers.add(2);
		numbers.add(44);
		numbers.add(21);
		numbers.add(32);
		numbers.add(18);
		
		numbers.add(0,21);// adding elements based on the index value	
		
		System.out.println(numbers);
		
		numbers.remove(2);
		System.out.println(numbers);
		
		boolean isEmpty = numbers.isEmpty(); // isEmpty() checks whether the Array_list is empty or not
		System.out.println(isEmpty);
		
		boolean present = numbers.contains(18); // contains() checks the element is present in the list or not
		System.out.println(present);
		
		int size = numbers.size();
		System.out.println(size);
		
		int getIndex = numbers.get(3);
		System.out.println(getIndex);
		
		int indexOF = numbers.indexOf(21); // If we give the element that is not present, it will return -1 as output
		System.out.println(indexOF);
		
		int lastIndexOf = numbers.lastIndexOf(21);
		System.out.println(lastIndexOf);
		
		for(int i = 0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}

}
