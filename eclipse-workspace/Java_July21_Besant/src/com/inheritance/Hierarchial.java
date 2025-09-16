package com.inheritance;

public class Hierarchial {

	public static void main(String[] args) {
		
		parents p = new parents();
		p.name = "father";
		p.display();
		
		son s1 = new son();
		s1.name = " son";
		s1.disply();
		
		Daughter d = new Daughter(); 
		d.name = " daughter";
		d.show();

	}

	
}

class parents {
	
	String name;
	int age = 45;
	
	public void display() {
		System.out.println("The name of the parent is  " + name + " " + age);
	}
}

class son extends parents {
	
	char gender = 'M';
	
	public void disply() {
		System.out.println("the name of the son is" + name + " "+gender);
	}
}

class Daughter extends parents {
	
	char gender = 'f';
	String degree = "bsc";
	
	
	public void show() {
		System.out.println("the name of the daughter is " + name + " " + degree+ " " + gender);
		
	}
}

// 20/08/2025 class
