package com.methods;

public class Private_access {

	public static void main(String[] args) {
		Person p = new Person("java class");
	
		p.setName("Balakrishnan");
		System.out.println(p.getName());
		
		p.setAge(23);
		System.out.println(p.getAge());
		
		p.show();

	}

}

// This is Private_Access class
class Person{
	
	private String name;
	private int age;
	String email;
		
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(String name) {
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private void display() {
		System.out.println("this is private " + name);
	}
	
	public void show() {
		display();
	}
	
}