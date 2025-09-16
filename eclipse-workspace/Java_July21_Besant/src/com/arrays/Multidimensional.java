package com.arrays;

import java.util.Arrays;

public class Multidimensional {

	public static void main(String[] args) {
		
		int [] [] numbers = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(numbers)); // printing the value of array
		System.out.println(numbers[0][1]);  // [] -> rows [] -> columns // finding the position of particular number
		numbers [0] [0] = 10; // replacing the particular element in a multidimensional array
		System.out.println(Arrays.deepToString(numbers));
		
		
		int [] [] numbers1 = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepEquals(numbers, numbers1));
		
	}

}

// 3/09/2025