package com.dsa.leetcode;

public class FindInMountainArray {

	public static void main(String[] args) {
		
		int[] mountainArr = {1,2,3,4,5,3,1,0};
		int target = 0;
		System.out.println(findInMountainArray(target, mountainArr));
	}
	
private static int findInMountainArray(int target, int[] mountainArr) {
	//As the given array is Mountain Array the minimum index must lie before the maximum number.
	
	//so first get the index of maximum value in the array.
	//then, apply the binary search for Ascending part
	
	int peak = peak(mountainArr); 
	
	//It will give the index of maximum number.
	
	
	//If the number is not present it should give -1.
	int firstTry = search(mountainArr, target, peak);
	
	if(firstTry != -1){
		return firstTry;
	}
	
	// if element is not found, then apply Binary Search in Descending array.
	
        return orderAgnostic(mountainArr, target, peak+1, mountainArr.length-1);
    }
	
private static int peak(int[] mountainArr){
		
		int start = 0;
		int end = mountainArr.length - 1;
		
		while(start != end){
			
			int mid = start +(end-start)/2; 
			
			if(mountainArr[mid] > mountainArr[mid+1]){
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
	
	
	private static int search(int[] arr, int target, int end) {
		//return index
		//return -1 if it does not exists.
		int start = 0;


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
	
	private static int orderAgnostic(int[] arr, int target, int start, int end){
		
		
		boolean isAscending = arr[start]>arr[end];
	while (start<=end) { //Till start > end run this loop or we can use //while(true)
		
		int mid = start +(end-start)/2; // it's actually the same and to avoid the exceed range of int value
										// we are approaching this way. It does not exceed the int range
		
		if (arr[mid] == target) 
		{
			return mid;
		}
		
		if(isAscending){
		
			if (target < arr[mid])
			{
				start = mid + 1;
			} 
			else 
			{
				end = mid - 1;
			}
		}
		else
		{
			if (target > arr[mid])
			{
				start = mid + 1;
			} 
			else 
			{
				end = mid - 1;
			}
		}
	}
	return -1;
}

}
