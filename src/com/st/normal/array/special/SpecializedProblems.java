package com.st.normal.array.special;

import java.util.Arrays;

public class SpecializedProblems {
	public static void main(String[] args) {
		// Find the missing number in a range
//		missingNumber(new int[] {3,4,5,7,8,10});
		missingOneNumberStatWith1(new int[] {1,2,3,5});
	
		
		// Stock Buy/Sell problems (one/multiple transactions)
	}
	
	public static void missingNumber(int a[]) {
		Arrays.sort(a);
		System.out.print("Missing numer: ");
		for(int i = 0; i<a.length-1; i++) {
			if(a[i] + 1 != a[i+1]) {
				System.out.print((a[i] + 1) + " ");
			}
		}
	}
	
	public static void missingOneNumberStatWith1(int a[]) {
		System.out.println();
		int n = a.length;
		int sum = n*(n+1)/2;
		int arraySum = 0;
		
		for(int i = 0; i<a.length-1; i++) {
			arraySum += a[i];
		}
		System.out.println("Missing number in rage strating from 1:" + (sum-arraySum));
	}
	

}
