package com.dsa.lecture14;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {-12,-4,0,1,3,5,12,33,47,51,78,204 };
		int target = 3;
		System.out.println(search(arr, target));
	}

	private static int search(int[] arr, int target) {
		//return index
		//return -1 if it does not exists.
		int start = 0;
		int end = arr.length - 1;

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
