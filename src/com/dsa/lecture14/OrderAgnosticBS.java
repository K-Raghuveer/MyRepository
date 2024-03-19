package com.dsa.lecture14;

import java.util.Scanner;

public class OrderAgnosticBS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 79,63,55,12,5,0,-1,-34,-221 };
		int target = 55;
		
		System.out.println(orderAgnostic(arr, target));
	
	}
	
	private static int orderAgnostic(int[] arr, int target){
	
			int start = 0;
			int end = arr.length - 1;
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
