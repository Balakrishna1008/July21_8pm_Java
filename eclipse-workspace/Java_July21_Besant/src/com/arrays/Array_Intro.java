package com.arrays;

import java.util.Arrays;

public class Array_Intro {

	public static void main(String[] args) {
		
	//	double marks [] = {88.25 , 60.50, 70.75 , 99.00};
	//	System.out.println(Arrays.toString(marks));
		
	//	System.out.println("Length : " + marks.length);
		
	//	System.out.println(marks[2]);
		
	//	marks[3] = 90.25;
	//	System.out.println(Arrays.toString(marks));
		
	
		
	//	marks [1] = 50;
	//	System.out.println(Arrays.toString(marks));
		
		
		// Other type of declaration and initialization
		
		int mark[] = new int[6]; 
		
		mark[0] = 80; // Assigning value to the array seperately
		mark[1] = 78;
		mark[2] = 56;
		mark[3] = 67;
		mark[4] = 37;
		mark[5] = 100;
		System.out.println(Arrays.toString(mark));
		
		// for loop
		for(int i = 0 ;  i< mark.length; i++) {
			System.out.println("The Array value : " + i + " " + mark[i]);
			
		}
		
		// for each loop
		
		for(int m : mark ) {
			System.out.println(m);
			
			
		}

		int scores [] = {1,2,4,5,6,7,6,5,4}; 
		System.out.println(scores.length); // finding the length of an array
		
		scores [0] = 78; // updating the value of the array using the index
		System.out.println(Arrays.toString(scores));
	}


}

// 1/09/2025

