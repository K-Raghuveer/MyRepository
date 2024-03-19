package com.dsa.lecture12;

import java.util.Scanner;

public class FindElementWithRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int start = 2;
		int end = 6;
		int target = 5;
		System.out.println(search(arr,start,end,target));
		
	
	}

	private static int search(int[] arr,int start, int end,int target){
		for (int i = start; i <= end; i++) {
			if(arr[i]==target){ //check if the target is same in the present index of an array
				return i;
			}
			
		}
		return -1; // it means the target is not found in the given range
	}
}
