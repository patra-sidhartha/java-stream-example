package com.st.normal.array.special;

public class TrappingRainWater {
	public static void main(String[] args) {
		// Trapping Rain Water problem
		//Input: arr[] = [3, 0, 1, 0, 4, 0, 2] // 10
		// Input: arr[] = [3, 0, 2, 0, 4] //7
		maxWater(new int[] {3, 0, 1, 0, 4, 0, 2});
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
