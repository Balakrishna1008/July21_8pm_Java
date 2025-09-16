package com.arrays;

import java.util.Arrays;

public class Array_Methods {

	public static void main(String[] args) {
	
		// sort
		int num [] = {10, 20,67, 3, 89,67,100,43};
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));
		
		// sort
		String  name [] = {"Java" , "Besant " , "Sowndharya" , "jdk" , "Python" , "Apple" , "Javascript" , "Jvm"};
		Arrays.sort(name);
		System.out.println(Arrays.toString(name));
		
		// binary search
		int nums [] = {10, 20,67,  3, 89,67,100,43};
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		int index = Arrays.binarySearch(nums, 3);
		System.out.println(index);
		
		if (index>= 0) {
			System.out.println("Element found");
		} 
		else {
			System.out.println("Element not found");
		}
		
		//Equals
		
		int arr1[] = {1,2,3,4};
		int arr2[] = {1,4,3,2};
		System.out.println(Arrays.equals(arr1, arr2));
		
		// fill
		
		int fillArray[] = new int [5];
		Arrays.fill(fillArray,4);
		System.out.println(Arrays.toString(fillArray));
		
		//copyOf
		
		int arr[] = {10,15,63,89};
		int copyArray [] = Arrays.copyOf(arr, 2);
		
		System.out.println("old array :" + Arrays.toString(arr));
		
		System.out.println("Copied array :" + Arrays.toString(copyArray));
		
		
		//copyOfRange
		int arr4[] = {10,15,63,89, 78, 100, 56};
		int copyofRangeArray [] = Arrays.copyOfRange(arr4, 1,5);
		
		System.out.println("old array :" + Arrays.toString(arr4));
		
		System.out.println("Copied array :" + Arrays.toString(copyofRangeArray));
	}

}

// 2/09/2025

