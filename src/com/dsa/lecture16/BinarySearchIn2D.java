package com.dsa.lecture16;

import java.util.Arrays;

//Finding the element in a 2d sorted array. The sorting is happened both row wise and column wise.


public class BinarySearchIn2D {

	public static void main(String[] args) {
		int[][] arr = { { 10, 21, 15, 20 }, 
						{ 15, 17, 22, 34 }, 
						{ 20, 32, 40, 48 },
						{ 25, 39, 53, 70} 
						};
		int target = 32;
		System.out.println(Arrays.toString(binarySearch(arr, target)));

	}
	

	public static int[] binarySearch(int[][] arr, int target) {
		// Taking row as 0. So it's starts from arr[0][0]
		int start = 0;
		// The column is the last index of the array.
		int end= arr.length-1;
		// As long as the row less than the length of the array and 
		// column greater than 0 the below code should execute.
		// The loop will break when the row count increase the length of the
		// array or column is less than 0.
		while (start < arr.length && end >= 0) {
			
		//the current pointing element in the array is equals to target, then ans is target
			if (arr[start][end] == target) {
				return new int[] { start, end };
			}
		//if the current element is > target then the below elements present in the column are bigger than the target element.
		//Hence ignore the present column and start searching in the before column.
			if (arr[start][end] > target) {
				end--;
			} 
		//if current element is less than the target then the elements present in the before this row are lesser. So move the row size to 1.
		// search from the next row.
			else {

				start++;
			}

		}
	//if element is not found return that the element you're searching is not present in this array.
		return new int[] { -1, -1 };
	}
	
	

}
