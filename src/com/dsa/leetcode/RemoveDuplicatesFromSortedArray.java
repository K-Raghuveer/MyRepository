package com.dsa.leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1 }; // Input array
		// int[] expectedNums = [...]; // The expected answer with correct
		// length

		System.out.println(removeDuplicates(nums)); // Calls your implementation

		// assert k == expectedNums.length;
		// for (int i = 0; i < k; i++) {
		// assert nums[i] == expectedNums[i];
		// }
	}

	public static int removeDuplicates(int[] nums) {
		int j = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i ] != nums[i-1]) {
				nums[j] = nums[i];
				j++;
			}
		}
		return j;

	}

}
