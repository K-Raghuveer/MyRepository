package com.dsa.leetcode;

public class FindPeakInMountain {

	public static void main(String[] args) {
		int [] nums = {0,1,3,5,8,6,3,1};
		System.out.println(nums[peak(nums)]); //this method returns index. so here i'm printing the value of a index
		
	}
	
	private static int peak(int[] nums){
		
		int start = 0;
		int end = nums.length - 1;
		
		while(start != end){
			
			int mid = start +(end-start)/2; 
			
			if(nums[mid] > nums[mid+1]){
				//you're in the Descending part of the array
				// It may be the ans but look at the left for the potential ans
				// that is why end != mid - 1
				
				end = mid;
			}
			else {
				//you're in the Ascending part of the array
				// look at the right for the potential ans
				// mid is less than mid + 1. so, take start one step ahead of mid.
				
				start = mid + 1;
			}
			
		}
		//Start and end are always trying to find the large number in the two checks.
		 //when the loop breaks, the start and end will point to the largest number in the array.
		
		
		return start; // return end. hence, both are pointing the large number.		
	}

}
