package com.array;

import java.util.Arrays;

public class Array_methods {

	public static void main (String [] args) {
		
		
		// Sorting methods ----
		
		int marks[] = {19, 21, 20, 13, 9};  
		Arrays.sort(marks);
		System.out.println(Arrays.toString(marks));
		
		String names[] = {"Henry", "Chrales", "Ben", "John", "Alex", "alan", "dev"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		
		System.out.println();
		
		
		// Binary Search ---
		
		int marks1[] = {19, 21, 20, 13, 9};
		Arrays.sort(marks1);
		System.out.println(Arrays.toString(marks1));
		
		int index = Arrays.binarySearch(marks1, 19); // Is the element is not there, it will return negative value
		System.out.println(index);
		
		if(index >= 0) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
		
		
		System.out.println();
		
		
		// equals ---
		
		int arr1[] = {1,2,3,4};
		int arr2[] = {1,2,3,4};
		System.out.println(Arrays.equals(arr1,arr2));
		
		System.out.println();
		
		// fill ---
		
		int fillarr[] = new int[5];
		Arrays.fill(fillarr, 3);
		System.out.println(Arrays.toString(fillarr));
		
		System.out.println();

		// copyof --
		
		int oldarr[] = {1,2,3,4};
		int copyarr[] = Arrays.copyOf(oldarr, 1); // If you are giving the length more than the previous array's length, the remaining element will be filled as 0's.
		System.out.println("Old Array : " + Arrays.toString(oldarr));
		System.out.println("Copied Array : " + Arrays.toString(copyarr));
		
		System.out.println();
		
		// copyRangeof --
		
		
		int oldarr1[] = {1,2,3,4};
		int copyarr1[] = Arrays.copyOfRange(oldarr1, 2, 6); 
		System.out.println("Old Array : " + Arrays.toString(oldarr1));
		System.out.println("Copied Array : " + Arrays.toString(copyarr1));
		
	}
	
	
}
