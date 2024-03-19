package com.dsa.leetcode;

public class RotatedBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 0, 1, 2, 3 };
		int target = 0;
		int ans = search(arr, target);

		// int ans = pivot(arr);

		System.out.println(ans);

	}

	private static int search(int[] arr, int target) {
		int pivot = pivot(arr);
		int start = 0;
		int end = arr.length - 1;
		
		// if you don't have a pivot it means the array is not rotated.
		
		if(pivot == -1){
			//just do normal binary search
			return binarySearch(arr, target, 0, arr.length-1);
		}
		
		//if pivot is found, you have found two Asecending sorted arrays.
		

		// case 1 : target = pivot
		if (target == arr[pivot]) {
			return pivot;
		}
		// if target < pivot check for start
		// case 2 : start < target

		if (arr[start] > target) {
			start = pivot + 1;

			return binarySearch(arr, target, start, end);
		} else {
			end = pivot - 1;
			return binarySearch(arr, target, start, end);
		}

	}

	// Finding Pivot (Maximum number in a rotated Array)
	private static int pivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		int mid = start + (end - start) / 2;
		// 4 cases of finding pivot
		
		while (start <= end) {
			// case 1 :- mid > mid+1
			if (mid < end && arr[mid] > arr[mid + 1]) {

				return mid;
			}

			// case 2 : mid < mid-1
			if (mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			// case 3 : start > = mid

			if (arr[mid] <= arr[start]) {
				end = mid - 1;

			}
			// case 4 : start < mid
			else {
				start = mid + 1;
			}

		}
		return -1;

	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		// return index
		// return -1 if it does not exists.

		while (start <= end) { // Till start > end run this loop or we can use
								// //while(true)

			int mid = start + (end - start) / 2; // it's actually the same and
													// to avoid the exceed range
													// of int value
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
