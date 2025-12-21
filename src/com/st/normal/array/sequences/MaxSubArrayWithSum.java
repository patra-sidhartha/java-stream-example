package com.st.normal.array.sequences;

public class MaxSubArrayWithSum {

	public static void main(String[] args) {
		// Find the maximum subarray sum(Kadane's Algorithm)
		// Input: arr[] = [2, 3, -8, 7, -1, 2, 3] Output: 11
		// Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.
		int arr[] = new int[] {2, 3, -8, 7, -1, 2, 3};
		maxSubArraySum(arr);
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

}
