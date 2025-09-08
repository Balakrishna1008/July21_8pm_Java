package com.inheritance;

public class examples {

	public static void main(String args[]) 
	{
//		Father F = new Father();
//		F.name = "DAD";
		
		Son S = new Son("DAD", "SON", 20);
//		S.name = "SON";
//		S.age = 22;
			
//		S.superName = F.name;
		S.show();
	}	
}


class Father{
	String name;
	
	Father(String name){
		this.name = name;
	}
	
//	public void display() {
//		System.out.println("Father's name is " + this.name);		}
}

class Son extends Father{
	
	String name;
	int age;
	
	
	Son(String superName, String name, int age) 
	{
		super(superName);
		this.name = name;
		this.age = age;
		
	}
	
	public void show() {
		System.out.println(this.age + " years old " + this.name + " is " + super.name+ "'s Son" );
	}
}



