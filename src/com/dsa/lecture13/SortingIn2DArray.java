package com.dsa.lecture13;

import java.util.Arrays;
import java.util.Scanner;

public class SortingIn2DArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = {
				{15,9,32,6},
				{-1,0,-203},
				{21,42,-5,-56,1}
		};
		
		search(arr);
		
		for (int[] is : arr) {
			System.out.println(Arrays.toString(is));
		}

	}

	private static void search(int[][] arr){
		for (int i = 0; i < arr.length; i++) { //Iterates over the row
			for (int j = 0; j < arr[i].length; j++) { //Iterates over the column 
				for (int k = 0; k < arr[i].length-1; k++) { //Iterates with one element in the column to all the elements in the row.
					if(arr[i][k]<arr[i][k+1]){
						swap(arr,i,k,k+1);
					}
				}
			}
			
		}
		
		
	}
	private static void swap(int[][] arr, int i, int k, int k1) {
		int temp = arr[i][k];
		arr[i][k] = arr[i][k+1];
		arr[i][k+1] = temp;
	}
}
