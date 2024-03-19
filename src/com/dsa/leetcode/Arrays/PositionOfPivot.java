package com.dsa.leetcode.Arrays;

public class PositionOfPivot {

	public static void main(String[] args) {
		
		int[] nums = {12,14,20,22,29,33,50,0,1,5,7,9};
		int ans = findPoistion(nums);
		
		System.out.println("The position of the pivot is "+ans );
		System.out.println("The pivot element is " + nums[ans]);
		ans = ans + 1;
		
		System.out.println("The roation count of the rotated sorted array is " + ans);
		
	}
	

	private static int findPoistion(int[] arr){
		
		int start = 0;
		int end  = arr.length -1;
		
		
		
		while(start <= end ){
			
			int mid = start + (end-start)/2 ;
			
			//case 1 : arr[mid] > arr[mid+1] arr ={5,6,7,0,1,2}
			if( end > mid && arr[mid] > arr[mid+1] ){
				return mid;
			}
			//case 2 : arr[mid-1] > arr[mid] arr ={5,6,7,0,1,2,3,4} 
			if( arr[mid] < arr[mid-1] ){
				return mid-1;
			}
			
			//case 3 : arr[start] > arr[mid] search in left side because all the numbers after the mid are less number.
			if( arr[start] >= arr[mid] ){
				
				end = mid -1;
			}
			
			//case 4 : arr[start] < arr[mid] then check in the right hand side.
			else{
				start = mid + 1;
			}
			
		}
		
		
		return -1;
	}
}
