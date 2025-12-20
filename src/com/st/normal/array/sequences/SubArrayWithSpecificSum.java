package com.st.normal.array.sequences;

public class SubArrayWithSpecificSum {
	public static void main(String[] args) {
		// Count subarrays with a specific sum or product
			// Count subarrays with a specific sum or product
//		int a[] = new int[] {10, 2, -2, -20, 10}; // k = -10 // 3
		int a[] = new int[] {9, 4, 20, 3, 10, 5}; // k = 33 // 2
		subarraysCountWithSpecificSum(a , 33);
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
