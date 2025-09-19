package com.collection;

import java.util.*;
import java.util.Comparator;
public class Comparable_Ex {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(04,"Emp4",56300.03d));
		list.add(new Employee(02,"Emp2",49890.03d));
		list.add(new Employee(03,"Emp3",23870.03d));
		list.add(new Employee(05,"Emp5",33930.03d));
		list.add(new Employee(01,"Emp1",28230.03d));
		
		Collections.sort(list, new IdComparator());
		
		System.out.println("Sorted by Id " + list);
		
		for(Employee e : list) {
			System.out.println(e);
		}
		Collections.sort(list, new SalaryComparator());
		System.out.println("Sorted by Salary : " + list);
	}
	

}

class Employee{
	int id;
	String name;
	double salary;
	
	Employee(int id, String n, double s){
		this.id = id;
		this.name = n;
		this.salary = s;
	}
	
	public String toString() {
		return id +" " +name + " "+salary;
	}
}

class NameComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.name.compareTo(e2.name); // comparing String data type
	}
}

class IdComparator implements Comparator <Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.id - e2.id; // comparing integer data type
	} 
}

class SalaryComparator implements Comparator <Employee>{
	@Override
	public int compare (Employee e1, Employee e2) {
		return Double.compare(e1.salary, e2.salary); // comparing double data type
	}
}
