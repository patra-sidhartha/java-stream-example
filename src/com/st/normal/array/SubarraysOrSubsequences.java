package com.st.normal.array;

import java.util.Arrays;

public class SubarraysOrSubsequences {

	public static void main(String[] args) {
		int[] arr = {2, 3, -8, 7, -1, 2, 3};

		// Find the maximum subarray sum(Kadane's Algorithm)
		//	maxSubArraySum(arr);
		// Find the longest consecutive elements sequence
		longestConsecutiveSeqEle(new int[] { 1,2,3,4, 6,7,8,10,11, 13,14,15,16});
		
		// Count subarrays with a specific sum or product
//		 int a[] = new int[] {10, 2, -2, -20, 10}; // k = -10 // 3
		 int a[] = new int[] {9, 4, 20, 3, 10, 5}; // k = 33 // 2
		subarraysCountWithSpecificSum(a , 33);
	}
	
	public static void maxSubArraySum(int a[]) {
		int res = a[0];
		
		for(int i =0; i<a.length; i++) {
			int currentSum = 0;
			for(int j=i; j< a.length; j++) {
				currentSum = currentSum + a[j];
				res = Math.max(currentSum, res);
			}
		}
		System.out.println("Max Sub Array Sum: " + res);
	}
	
	public static void longestConsecutiveSeqEle(int a[]) {
		// 1,2,3,4, 6,7,8,10,11, 13,14,15,16
		Arrays.sort(a);
		
		int res = 1; 
		int counter = 1;
		
		for(int i=1; i < a.length; i++) {
			if(a[i] == a[i-1])
				continue;
			if(a[i] == a[i-1] + 1) {
				counter++;
			} else {
				counter = 1;
			}
			res = Math.max(counter, res);		
		}
		System.out.println("longestConsecutiveSeqEle:" + res);
	}

	public static void subarraysCountWithSpecificSum(int a[], int target) {
		// Input : arr[] = [10, 2, -2, -20, 10], k = -10
		// Input : arr[] = [9, 4, 20, 3, 10, 5], k = 33
		int count = 0;
		for(int i=0; i< a.length; i++) {
			int currentSum = 0;
			for(int j=i; j< a.length; j++) {
				currentSum += a[j];
				if(currentSum == target) {
					count++;
				}
			}
		}
		System.out.println("subarraysCountWithSpecificSum: " + count);
	}
}
