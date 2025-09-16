package com.polymorphism;

public class Compile_Time {

	public static void main(String[] args) {
		
	Student s = new Student();
	s.printData(1, "Student1");
	
	Student s1 = new Student();
     s1.printData("stu2", 2);
	
	
		
	System.out.println(multiplication(2, 4));	
	
	System.out.println(multiplication(1,2,3));
	
	System.out.println(multiplication(2.3, 4.5,5.2));

	}
	
	public  static int multiplication(int a , int b) {
		return a*b;
	}
	
	public static  int multiplication(int a , int b , int c) {
		return a*b*c;
	}
	
	public static  double multiplication(double a , double b , double c) {
		return a*b*c;
	}
	
	}

  class Student {
	  int id;
	  String name;
	  
	  public void printData(int id , String name) {
		 System.out.println(id + " " + name);
	  }
	  
	  public void printData(String name , int id) {
			 System.out.println(name + " " + id);
		  }
  }
  
  
  
  // The above code is the  example of method overloading
  
  //method overloading is also called as compile time polymorphism
  
  // 26/08/2025

	

