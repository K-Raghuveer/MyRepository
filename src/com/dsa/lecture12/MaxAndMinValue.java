package com.dsa.lecture12;

import java.util.Scanner;

public class MaxAndMinValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {21,54,66,2,33,564,778,06,453,11,0001,5};
		System.out.println(maxValue(arr));
		System.out.println(minValue(arr));
		
	}

	private static int maxValue(int[] arr){
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	
	private static int minValue(int[] arr){
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}
}
