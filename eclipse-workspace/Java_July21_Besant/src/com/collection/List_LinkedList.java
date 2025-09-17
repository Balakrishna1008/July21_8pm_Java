
package com.collection;

import java.util.LinkedList;

public class List_LinkedList {

	public static void main(String[] args) {
	
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Citrus");
		fruits.add("Dragon");
		fruits.remove("Apple");
		
		System.out.println(fruits);
		 fruits.addFirst("papaya");
		 fruits.addLast("Pineapple");
		 System.out.println(fruits);
		 
		 fruits.remove();
		 System.out.println(fruits);
		 
		 fruits.remove(2);
		 System.out.println(fruits);
		 
		 fruits.remove("Pineapple");
		 System.out.println(fruits);
		 
		 fruits.removeFirst();
		 fruits.removeLast();
		 System.out.println(fruits);
		 
		 fruits.add("pomegranate");
		 fruits.add("Mango");
		 fruits.add("Avacado");
		 fruits.add("berries");
		 
		 
		 System.out.println(fruits);
		 
		 fruits.peek();
		 System.out.println(fruits);
		 
		 fruits.poll();
		 System.out.println(fruits);
		 
		 fruits.pop();
		
	}

}


// 12/09/2025


