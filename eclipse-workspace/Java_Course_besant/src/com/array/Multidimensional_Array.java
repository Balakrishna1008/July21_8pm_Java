package com.array;

import java.util.Arrays;

public class Multidimensional_Array {

	public static void main(String[] args) {
		
		int nums [][] = {{1,2,3,4},{5,6,7,8}};
		
		System.out.println(Arrays.deepToString(nums));
		System.out.println(nums[0][1]);
		System.out.println(nums[1][3]);
		
		nums[0][1] = 10;
		System.out.println(Arrays.deepToString(nums));
		
		int nums1[][] = {{1,2,3,4},{5,6,7,8}};
		
		System.out.println(nums == nums1);
		
		System.out.println(nums[0][0] == nums1[0][0]);
		
		System.out.println(Arrays.deepEquals(nums, nums1));
		
	}

}
