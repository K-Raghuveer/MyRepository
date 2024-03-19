package com.dsa.lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInStringsArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "RaEvghEuveevr";
		char ch = 'e';
		int count=0;
		
//		System.out.println(search(str,ch));
//		occurences(str,ch,count);
		
		
	}
	
	private static int search(String str,char ch){
		
		for (int i = 0; i < str.length(); i++) {
			if(ch==str.toLowerCase().charAt(i)){ //converting string into a lower case and checking with a character
				return i;
			}
			else if(ch==str.toUpperCase().charAt(i)){ //converting string into a Upper case and checking with a character
				return i;
			}
		}
		return -1;
	}
	
	private static void occurences(String str,char ch,int count){
		
		for (int i = 0; i < str.length(); i++) {
			if(ch==str.toLowerCase().charAt(i)){ //converting string into a lower case and checking with a character
				count++;
			}
			else if(ch==str.toUpperCase().charAt(i)){ //converting string into a Upper case and checking with a character
				count++;
			}
		}
		System.out.println(count);
		
	}
	
//	 public static int[] twoSum(int[] nums, int target) {
//	        for(int i=1;i<nums.length;i++){
//	        	for (int j = 0; j < nums.length; j++) {
//					
//	            if(nums[i]+nums[i-1]==9)
//	            {
//	                return new int []{i,i-1};
//	            } 
//	        	}
//	        }
//	        return new int[]{-1,-1};
//	    }
}
