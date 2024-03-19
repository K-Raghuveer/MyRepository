package com.dsa.leetcode;

public class InfinteArraySearch {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,7,10,23,25,29,34,38,42,67,73,78,234};
		int target = 73;
		System.out.println(ans(arr, target));
	}
	
	private static int ans(int[] arr, int target){
		
		//The given array is infinite sorted array so we do not know the size of the array.
		
		//So, let's take the single chunk of array and keep doubling it until we find the range that the target lies.
		
		// this approach is quite opposite (bottom to the start) to the Binary Search time complexity explanation. 
		
		int start = 0;
		int end = 1;
		
		// Double the size of the array until the target element position is less than the end.
		
		while(target > arr[end]){
			//Doubling the size of the array chunk.
			
			int newStart = end + 1; // The new start of the array Size
			
			//the new end will be the past end + (size of the previous array) * 2
			end = end + (end-start+1) * 2;
			
			start = newStart; //After finding the element range the Start value will become the newStart value.
						
		}
		
		return search1(arr, target, start, end);
	}
	
	private static int search1(int[] arr, int target, int start, int end) {
		//return index
		//return -1 if it does not exists.
	

		while (start<=end) { //Till start > end run this loop or we can use //while(true)
			
			int mid = start +(end-start)/2; // it's actually the same and to avoid the exceed range of int value
		// we are approaching this way. It does not exceed the int range
			
			if (arr[mid] == target) 
			{
				return mid;
			}
			else if (target < arr[mid])
			{
				end = mid - 1;
			} 
			else 
			{
				start = mid + 1;
			}
		}
		return -1;
	}

}
