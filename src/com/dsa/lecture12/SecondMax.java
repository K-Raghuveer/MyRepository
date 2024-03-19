package com.dsa.lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 21, 54, 6, 2, 33, 564, 778, 0, -1, -453, 11, 0001, 5 };
		System.out.println(secondMax(arr));
		System.out.println(Arrays.toString(arr));


	}

	private static int secondMax(int[] arr) {
		// Considering first index value is maximum
		for (int i = 0; i < arr.length; i++) { //Iterates over the array
			for(int j=0; j<arr.length-1;j++){ //It iterates with one element to all the elements in an array
			
			if (arr[j] < arr[j+1]) { // check if the next element is > previous element
								// then swap the two indices

				swap(arr, j, j+1);
				
			   }
			}

		}

		return arr[1];
	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
