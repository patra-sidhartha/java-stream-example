package com.st.normal.array.find;

import java.util.Arrays;

public class FindPairClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = {1, 60, -10, 70, -80, 85};
        findPairWithSumClosestToZero(inputArray);
        
        int[] inputArray2 = {-3, -2, -1, 1, 2};
        findPairWithSumClosestToZero(inputArray2);

	}
	
	public static void findPairWithSumClosestToZero(int a[]) {
		// if array length > 1 then proceed
		Arrays.sort(a);
		
		int left = 0;
		int right = a.length-1;
		int minSum = Integer.MAX_VALUE;
		int element1 = 0;
		int element2 = 0;
		
		while(left < right) {
			int currentSum = a[left] + a[right];
			
			if(Math.abs(currentSum) < Math.abs(minSum)) {
				minSum = currentSum;
				element1 = a[left];
				element2 = a[right];
			}
			
			if(currentSum == 0) {
				break;
			} else if(currentSum < -1) {
				left++;
			} else {
				right--;
			}
		}
		System.out.println("Paired Element Closest to Zero are: " + element1 + " : " + element2);
	}
}
