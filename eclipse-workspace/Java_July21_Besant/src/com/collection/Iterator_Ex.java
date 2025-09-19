package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator_Ex {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(21);
		numbers.add(22);
		numbers.add(23);
		numbers.add(24);
		numbers.add(25);
		numbers.add(26);
		System.out.println(numbers);
		
		Iterator<Integer> itr = numbers.iterator();// collection for iterating values 
		while(itr.hasNext()) {
			int num = itr.next();
			System.out.println(num);
		}
		
	}

}
