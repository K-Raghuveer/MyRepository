package com.dsa.leetcode;

public class SqrtOfaNumber {

	public static void main(String[] args) {
		int x = 8;
		
		System.out.println(mySqrt(x));
		
	}
	
	public static int mySqrt(int x) {
        if(x!=0){
            int start = 1;
            int end = x;
            while(end >= start){
                int mid = start + (end - start)/2;
                if((long) mid*mid == (long)x){
                    return (int) mid;
                }
                if((long) mid*mid > (long)x){
                    end = mid-1; 
                }
                else {
                    start = mid+1;
                }


            }
            return (int) end;
        }
        return 0;
    }
}
