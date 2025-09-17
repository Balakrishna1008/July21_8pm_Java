package com.collection;

import java.util.*;

public class Queue_PriorityQueue {

	public static void main(String[] args) {

		Queue<Integer> marks = new PriorityQueue<>();
		
		marks.add(21);
		marks.add(98);
		marks.add(34);
		marks.add(17);
		marks.add(55);
		marks.add(86);
		
		System.out.println(marks.poll()); // it will remove and show the first element
		System.out.println(marks.peek()); // it will show the first element, does not remove
		
//		marks.remove(); // removes the first list , if no element in list, it will throw NullPointerException
		
		System.out.println(marks);

		marks.poll(); // removes the first element, if no element in list, it will show null.
		System.out.println(marks);
		
		
	}

}
