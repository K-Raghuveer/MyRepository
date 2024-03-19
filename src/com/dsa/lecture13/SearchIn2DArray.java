package com.dsa.lecture13;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = { { 21, 3, 67, 8, 1 }, { 0, -2, 34 }, { 98, 65, 77, 22, 4 }, { 2, 3, 4, 5, 6 } };
		int target = -1;
		
		System.out.println(Arrays.toString(search(arr,target)));
	}

	private static int[] search(int[][] arr,int target){
		//Assuming array is not an empty 
		//run the loop till the length of an array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==target){
					//intialising new array and returning it
					return new int[]{i,j};
				}
			}
			
			
		}
		//if the target is not found it returns empty array which means character not found.
		return new int[]{}; // return new int[] {-1,-1};  
		
	}
}
