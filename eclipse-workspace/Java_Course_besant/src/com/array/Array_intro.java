package com.array;

import java.util.Arrays;

public class Array_intro {

	public static void main (String [] args) {
		double[] marks1 = {98.33, 97.18, 44.32, 78.45};
//		System.out.println(marks1[1]);
		
		marks1[0] = 11.1;
//		System.out.println(Arrays.toString(marks1));
		
		int marks [] = new int[5];
		marks[0] = 11;
		marks[1] = 11;
		marks[2] = 12; 
		marks[3] = 13;
		marks[4] = 14;

		
		System.out.println(Arrays.toString(marks));
		
		
		// Normal for loop ---
		for(int i = 0; i< marks.length ; i++) {
			System.out.println("The array element of " + i + " is " + marks[i]);
		}
		
		System.out.println();
		
		// For each loop -----
		for(int m : marks) {
			System.out.println(m);
		}
	}
}
