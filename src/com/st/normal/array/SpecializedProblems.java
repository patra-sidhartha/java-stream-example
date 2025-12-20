package com.st.normal.array;

import java.util.Arrays;

public class SpecializedProblems {
	public static void main(String[] args) {
		// Find the missing number in a range
//		missingNumber(new int[] {3,4,5,7,8,10});
//		missingOneNumberStatWith1(new int[] {1,2,3,5});
		
		// Trapping Rain Water problem
		//Input: arr[] = [3, 0, 1, 0, 4, 0, 2] // 10
		// Input: arr[] = [3, 0, 2, 0, 4] //7
		maxWater(new int[] {3, 0, 1, 0, 4, 0, 2});
		
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
	
//	Input: arr[] = [3, 0, 1, 0, 4, 0, 2]
//	Output: 10
//	Explanation: The expected rainwater to be trapped is shown in the above image.

//	Input: arr[] = [3, 0, 2, 0, 4]
//	Output: 7
//	Explanation: We trap 0 + 3 + 1 + 3 + 0 = 7 units.

//	Input: arr[] = [1, 2, 3, 4]
//	Output: 0
//	Explanation: We cannot trap water as there is no height bound on both sides
	
	 static void maxWater(int[] arr) {
//		 Input: arr[] = [3, 0, 1, 0, 4, 0, 2]
	        int res = 0;

	        // For every element of the array
	        for (int i = 1; i < arr.length - 1; i++) {
	            // Find the maximum element on its left
	            int left = arr[i];
	            for (int j = 0; j < i; j++)
	                left = Math.max(left, arr[j]);

	            // Find the maximum element on its right
	            int right = arr[i];
	            for (int j = i + 1; j < arr.length; j++)
	                right = Math.max(right, arr[j]);

	            // Update the maximum water
	            res += Math.min(left, right) - arr[i];
	        }
	        System.out.println("Max watr in unit: " + res);
	    }
}
