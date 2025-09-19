package com.collection;

import java.util.*;

public class Comparator_Ex {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		
		list.add(new Student(101, "Krish"));
		list.add(new Student(102, "balakrish"));
		list.add(new Student(103, "Bala"));
		
		Collections.sort(list);
		
		System.out.println("Sorted by name : " + list);
		
//		System.out.println(compareTo("Balakrish"));
		
		
	}

}

class Student implements Comparable <Student> {
	
	int rollNo;
	String name;
	
	Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public int compareTo(Student other) {
//		return this.name.compareTo(other.name);
		return this.rollNo - other.rollNo;
	}
	
	public String toString() {
		return rollNo +" " +name;
	}
	
}