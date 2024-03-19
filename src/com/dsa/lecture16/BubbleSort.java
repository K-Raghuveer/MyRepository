package com.dsa.lecture16;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	static void sort(int[] arr){
//	Taking Variable to compare whether the array is swapped or not after the iteration.
//	If it is not swapped means then the array is already sorted. Then stop the program.
		boolean swapped;
//	Iterate the array till it reaches end.
		for (int i = 0; i < arr.length; i++) {
			swapped = false;
//	After every iteration the largest element will come and sit at the last.
//	So ignore the last element after the iteration to avoid comparing bcz it is already sorted
			for (int j = 1; j < arr.length - i; j++) {
//	Compare whether the item is less than the previous item if so then swap
				if(arr[j] < arr[j-1]){
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
//  If it is swapped then continue with the next iteration.
					swapped = true;
				}
			}

//  If it is not swapped means then the array is already sorted. Then stop the program.
			if(!swapped) {
				break;
			}
			
		}
		
	}

}
