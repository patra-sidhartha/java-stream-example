package com.st.normal.array.sequences;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LogestConsecutiveSubArray {
	public static void main(String[] args) {
		// Find the longest consecutive elements sequence
//		longestConsecutive(new int[] {5,6,1,2,7,3});
		longestConsecutiveUsingHashSet(new int[] {5,6,1,2,7,3});
	}
	
	public static void longestConsecutive(int[] array) {
        if (array.length == 0) {
        	System.out.println("Array is empty");
            return;
        }

        Arrays.sort(array); // Sort the array
        
        int longestStreak = 1;
        int currentStreak = 1;
        
        for(int i=1; i<array.length; i++) {
        	if(array[i] != array[i-1]) {
        		if(array[i] == array[i-1] + 1) {
        			currentStreak++;
        		} else {
        			currentStreak = 1;
        		}
        	}
        	longestStreak = Math.max(longestStreak, currentStreak);
        }
        System.out.println("longestStreak:" + longestStreak);
	}
	
	public static void longestConsecutiveUsingHashSet(int[] array) {
		if (array.length == 0) {
        	System.out.println("Array is empty");
            return;
        }
		
		Set<Integer> numSet = new HashSet<>();

		for(int num: array) {
			numSet.add(num);
		}
		
		int longestStreak = 0;
		for (int num : array) {
			// Check if 'num' is the start of a sequence
			  if (!numSet.contains(num - 1)) {
				  int currentNum = num;
	               int currentStreak = 1;
	               
	               while (numSet.contains(currentNum + 1)) {
	                    currentNum++;
	                    currentStreak++;
	                }
	                longestStreak = Math.max(longestStreak, currentStreak);
			  }
		  
		}
		System.out.println("longestStreak:" + longestStreak);
	}
}
