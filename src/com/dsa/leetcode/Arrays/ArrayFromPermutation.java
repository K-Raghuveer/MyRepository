package com.dsa.leetcode.Arrays;

import java.util.Arrays;

public class ArrayFromPermutation {

	public static void main(String[] args) {
		int[] arr = {0,2,1,5,3,4};
		
		System.out.println(Arrays.toString(builtArray(arr)));
		
	}
	
	private static int[] builtArray(int[] arr){
		int[] ans = new int[6];
			
		for (int i = 0; i < arr.length; i++) {
			ans[i] = arr[arr[i]];
			
		}
		
		return ans;
	}

}
