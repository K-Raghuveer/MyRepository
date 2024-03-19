package com.dsa.lecture14;

import java.util.Scanner;

public class Ceiling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		int[] arr = { -23,-1,0,2,4,6,16,48,54,63,70,223}; Descending order
		int[] arr = { 223,73,70,65,61,54,46,41,30,25,14,10,7,2,0,-1}; //Ascending irder
		int target = 62;
		
		int ans = orderAgnostic(arr,target); //To find out which type of array is given
		System.out.println(arr[ans]);
	
	}

	
	private static int orderAgnostic(int[] arr, int target){
	
			int start = 0;
			int end = arr.length - 1;
			boolean isAscending = arr[start]>arr[end];
			
			//if the target is greater than the greatest element in an array
			// return -1 or the target is not found
			if(target > arr[0]){
				return -1;
			}
			
			while (start<=end) {       //Till start > end run this loop or we can use //while(true)
				
				int mid = start +(end-start)/2; // it's actually the same and to avoid the exceed range of int value
												// we are approaching this way. It does not exceed the int range
				
				if (arr[mid] == target ) 
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
			return start; // The least greater number of a target lies before the end for Descending array.
						//for Ascending arrays the least greater number lies after the start.
		}				
		

}
