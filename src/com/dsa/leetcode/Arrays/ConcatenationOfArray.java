package com.dsa.leetcode.Arrays;
//https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;

public class ConcatenationOfArray {

	public static void main(String[] args) {
		int[] arr = {1,2,1};
		System.out.println(Arrays.toString(concat(arr)));
		
	}

	private static int[] concat(int[] nums){
		int[] arr = new int[2 * nums.length];
		
		
		for (int i = nums.length; i < arr.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				arr[j] = nums[j];
			}
			arr[i] = nums[i-nums.length];
			
		}
		
		return arr;
		
	}
}
