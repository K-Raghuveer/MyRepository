package com.dsa.leetcode;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {

		int[] nums = { 3, 3 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));

	}

	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) { // it takes one element and
												// iterates through out the
												// array
			for (int j = 1; j < nums.length; j++) { // It takes one element and
													// compares it with other
													// elements in an array
				if (j != i) { // Element1 should not compare with the same
								// element1 again.
					if (nums[i] + nums[j] == 6) { // if element1 and element2 is
													// equals to 6
						return new int[] { i, j }; // return that position or
													// indices of the element
					}
				}
			}
		}
		return new int[] { -1, -1 };
	}
}
