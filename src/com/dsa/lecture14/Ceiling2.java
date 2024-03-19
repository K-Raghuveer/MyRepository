package com.dsa.lecture14;

public class Ceiling2 {
	
	 public static void main(String []args) {
	       
	        int[] arr = {2,3,6,12,36,38,43,65,99,132,553,999};
	        int target = 99;
	        int ans = ceiling(arr,target);
	        System.out.println("The ceieling of a number is"+arr[ans]);
	    }

	 private static int ceiling(int[] arr, int target) {

	        int start = 0;
	        int end = arr.length-1;
	        

	        while(start <= end) {
	        	int mid = start + (end-start)/2;

	            if(arr[mid] == target) {
	                return mid;
	            } else if(target > arr[mid]) {
	                start = mid + 1;
	            } else {
	                end = mid - 1;
	            }
	        }
	        return start;
	    }
}
