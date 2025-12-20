package com.st.normal.array;

import java.util.Arrays;

public class SubarraysOrSubsequences {

	public static void main(String[] args) {
		int[] arr = {2, 3, -8, 7, -1, 2, 3};

		// Find the longest consecutive elements sequence
		longestConsecutiveSeqEle(new int[] { 1,2,3,4, 6,7,8,10,11, 13,14,15,16});
		
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

	
}
