package com.abstraction;

public class AbstractClass_Example {

	public static void main(String[] args) {
	
         Animal a = new Rat();
         a.eat();
         a.sleep();
	}

}

 abstract class Animal {
	 public abstract void eat(); // abstract method
	 
	 public void sleep() {
		 System.out.println("Sleeping");  // concrete method
	 }
 }
 
 class Rat extends Animal {
	 
	 public void eat() {
		 System.out.println("Rat eats Cheese");
	 }
 }
 
 
 // 29/08/2025