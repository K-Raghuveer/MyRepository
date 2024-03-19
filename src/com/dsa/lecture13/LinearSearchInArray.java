package com.dsa.lecture13;

import java.util.Scanner;

public class LinearSearchInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {7,12,45,6,2,7,9,885,44};
		int target = 44;
		
		System.out.println(search(arr, target));
	}
	//Checking whether the target is present in an array or not
	private static int search(int[] arr,int target){
		//if array is an empty return error
		if(arr.length==0){
			return -1;
		}
		//run the loop till the length of an array
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==target){
				return i;
			}
		}
		return -1;
		
	}
	
}
