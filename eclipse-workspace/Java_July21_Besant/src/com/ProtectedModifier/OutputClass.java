package com.ProtectedModifier;

import com.methods.Protected_Child;

public class OutputClass {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.animal();
		
		// same package
		// Cat c = new Cat();
		// c.type = "cat";
		// c.cat();

		// different package
		Protected_Child pc = new Protected_Child();
		System.out.println(pc.type = "Black cat");
		pc.animal();
		pc.Differentcat();
		
	}

}
// 25/08/25