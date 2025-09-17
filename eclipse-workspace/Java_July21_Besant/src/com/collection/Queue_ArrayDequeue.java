// It will maintain the insertion order

package com.collection;

import java.util.*;

public class Queue_ArrayDequeue {

	public static void main(String[] args) {

		Deque<Integer> marks = new ArrayDeque<>();// TODO Auto-generated method stub

		marks.add(21);
		marks.add(33);
		marks.add(46);
		marks.add(18);
		marks.add(98);
		marks.add(40);
		
		marks.addFirst(10); // adds element at first
		marks.addLast(100); // adds element at last		
		System.out.println(marks);
		
		marks.removeFirst();
		System.out.println(marks);
		
		marks.removeLast();
		System.out.println(marks);
		
	}

}
