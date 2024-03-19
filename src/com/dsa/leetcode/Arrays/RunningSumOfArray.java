package com.dsa.leetcode.Arrays;
//https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;

public class RunningSumOfArray {

	public static void main(String[] args) {
		int[] nums = {1,1,1,1,1};
		
		System.out.println(Arrays.toString(runningSum(nums)));
	}

	private static int[] runningSum(int[] nums){
		int[] ans = new int[nums.length];
		int j = 0;
		
		for(int i=0; i<= nums.length-1; i++){
			
			if(i!=0){
				ans[i] = ans[i-1]+nums[i];
			}
			else {
				ans[i] = nums[i];
			}
			
		}
		
		
		return ans;
		
	}
}
