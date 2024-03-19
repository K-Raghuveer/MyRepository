package com.dsa.leetcode.Arrays;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestWealth {

	public static void main(String[] args) {
		int[][] accounts = {
		                    {1,2,3},
		                    {3,2,1},
		                    {72,8,9}};
		
		System.out.println(wealth(accounts));
				
	}
	
	private static int wealth(int[][] accounts){
		 int maxWealth = Integer.MIN_VALUE;
			for (int i = 0; i < accounts.length; i++) {
	            //for every row take the new wealth
				int rowWealth = 0;

				for (int j = 0; j < accounts[i].length; j++) {
					rowWealth += accounts[i][j];
				}
	            // check the wealth with the maximum value.
				if(rowWealth > maxWealth){
					maxWealth = rowWealth;
				}
			}
			
			return maxWealth;
			
		}

}
