package com.collection;

import java.util.LinkedList;

public class List_LinkedList {

	public static void main(String[] args) {

		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Banana");
		fruits.add("Banana2");
		fruits.add("Banana3");
		fruits.add("Banana4");
		fruits.add("Banana5");
		fruits.add("Banana6");
		System.out.println(fruits);
		
		fruits.addFirst("FirstBanana"); // adding elements at first
		fruits.addLast("LastBanana"); // adding elements at last
		System.out.println(fruits);

		fruits.remove(); // it will remove the first element
		System.out.println(fruits);
		
		fruits.remove(2); // it will remove the indexed element
		System.out.println(fruits);
		
		fruits.remove("Banana6"); // removes the element according with the name, even the element is not inside the LinkedList, It will run without error
		System.out.println(fruits);
		
		fruits.removeFirst();
		fruits.removeLast();
		System.out.println(fruits);
	
		System.out.println(fruits.peek()); // returns the first element in the List
		System.out.println(fruits.pop()); // removes and returns the first element in the list
		System.out.println(fruits);
		
		fruits.poll(); // poll used to remove the first element, poll() and removeFirst() are similar, but when the list is empty, poll() returns null whereas removeFirst() throws exception.
		fruits.pop(); // removes the last element
		
		System.out.println(fruits);
		
		
		int indexOf = fruits.indexOf("Banana2"); // returns index of the element
		System.out.println(indexOf);
	}	

}
