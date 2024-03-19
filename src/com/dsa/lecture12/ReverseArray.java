package com.dsa.lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		reverse(arr);
	}

	private static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (end > start) { // run the loop till end >start which is
								// technically contents to be swapped are over.
			swap(arr, start, end); // calling the below swapping method
			end--;
			start++;
		}

		System.out.println(Arrays.toString(arr));

	}

	private static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
}
