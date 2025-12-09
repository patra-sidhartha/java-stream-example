package com.st.normal.array.find;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindPairElement {
	public static void main(String[] args) {
		// Find all pair of elements that sum to given target.
//		findPairNormal(new int[] {1,4,3, 6, 2, 3, 5}, 7);
//		
		findPairsTwoPointer(new int[] {1,4,3, 6, 2, 3, 5}, 7);
		findPairsWithHashMap(new int[] {1,4,3, 6, 2, 3, 5}, 7);
	}
	
	public static void findPairNormal(int[] array, int target) {
		// check null array, empty, length<2
		for(int i=0; i < array.length; i++) {
			for(int j=i+1; j < array.length; j++) {
				if(array[i] + array[j] == target) {
					System.out.println(array[i] + "---" + array[j]);
				}
			}
		}
	}
	
	  public static void findPairsTwoPointer(int[] array, int target) {
		  Arrays.sort(array);
		  
		  int left = 0;
		  int right = array.length-1;
		  
		  while(left < right) {
			  int sum = array[left] + array[right];
			  
			  if(sum == target) {
				  System.out.println(array[left] + "-----" + array[right]);
				  left++;
				  right--;
			  } else if(sum < target) {
				  left++;
			  } else {
				  right--;
			  }
		  }
	  }
	  
	  public static void findPairsWithHashMap(int[] array, int target) {
		  Map<Integer, Integer> map = new HashMap<>();
		  
		  for(int i=0; i<array.length; i++) {
			  int complement = target - array[i];
			  
			  if(map.containsKey(complement)) {
				  System.out.println(complement + "----" + array[i]);
			  }
			  map.put(array[i], i);
		  }
	  }
}
