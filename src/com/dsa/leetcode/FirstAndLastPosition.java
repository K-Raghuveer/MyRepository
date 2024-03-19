package com.dsa.leetcode;

import java.util.Arrays;

public class FirstAndLastPosition {

	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		System.out.println(Arrays.toString(searchRange(nums, target)));
	}
	 public static int[] searchRange(int[] nums, int target){
		int[] ans = {-1,-1};
		int start = search(nums, target, true);
		int end = search(nums, target, false);
		ans[0] = start;
		ans[1] = end;
		return ans;
	}
	 
	 private static int search(int[] nums, int target, boolean firstIndex) {
		//return index
			//return -1 if it does not exists.
			int start = 0;
			int end = nums.length - 1;
			int ans = -1;

			while (start<=end) { //Till start > end run this loop or we can use //while(true)
				
				int mid = start +(end-start)/2; // it's actually the same and to avoid the exceed range of int value
												// we are approaching this way. It does not exceed the int range
				if (target < nums[mid])
				{
					end = mid - 1;
				} 
				else if(target > nums[mid])
				{
					
					start = mid + 1;
				}
				else 
				{
					//Possible answer but there may be another ans lie over the array before this.
					 ans = mid;
					 if(firstIndex == true){
						 end = mid - 1; // search if there is first occurrence in the array
					 }
					 else {
						 start = mid + 1; // search if there is last occurrence in the array
					 }
					 
				}
			}
			return ans;
	 }

}
