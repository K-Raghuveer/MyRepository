package com.dsa.lecture16;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = {4,5,2,1,3 };

		sort(arr);

		System.out.println(Arrays.toString(arr));

	}

	static void sort(int[] arr) {
		// start iterating from the first element till the last element
		for (int i = 0; i < arr.length - 1; i++) {
			// last element will change after every iteration. The maximum
			// number will occupy the last index after first iteration
			int last = arr.length - i - 1;
			// Find the index of a maximum element in the array
			int maxIndex = findMaxIndex(arr, 0, last);
			// Swap it with the correct position
			swap(arr, maxIndex, last);

		}

	}

	static int findMaxIndex(int[] arr, int first, int last) {
		// Assuming the first element is a maximum number
		int max = first;
		// Iterate over the array until you come to an end of the array
		for (int i = first; i <= last; i++) {
			// Compare the elements and assign if the current element is greater
			// than our maximun number
			if (arr[i] > arr[max]) {
				max = i;
			}
		}
		// return the maximum number of the array
		return max;
	}

	static void swap(int[] arr, int first, int last) {
		int temp = arr[first];
		arr[first] = arr[last];
		arr[last] = temp;
	}

}
