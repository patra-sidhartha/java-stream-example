package com.st.normal.array.manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		// Remove duplicates from a sorted/unsorted array
//		removeDuplicatesUnsortedOrderPreserving(new int[] {20,10,10, 30,20,40});
//		removeDuplicatesUnsortedArrayList(new int[] {20,10,10, 30,20,40});
		removeDuplicatesSortedInPlace(new int[] {20,10,10, 30,20,40});
	}
	
	public static void removeDuplicatesUnsortedOrderPreserving(int[] array) {
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		for(int num: array) {
			set.add(num);
		}
		
		int[] uniqueArray = set.stream().mapToInt(Integer::intValue).toArray();
		System.out.println("The Unique Array:" + Arrays.toString(uniqueArray));
	}
	
	 public static void removeDuplicatesUnsortedArrayList(int[] array) {
		 List<Integer> list = new ArrayList<>();
		 for(int num: array) {
			 if(!list.contains(num)) {
				 list.add(num);
			 }
		 }
		 
		 int[] uniqueArray = list.stream().mapToInt(Integer::intValue).toArray();
		 System.out.println("The Unique Array:" + Arrays.toString(uniqueArray));
	 }
	 
	 public static void removeDuplicatesSortedInPlace(int[] array) {
         if (array.length == 0 || array.length == 1) {
        	 System.out.println("Array doesn't have more than one element");
             return;
         }
         
         Arrays.sort(array);
         
         int j = 0;
         
         for(int i=0; i < array.length-1; i++) {
        	 if(array[i] != array[i+1]) {
        		 array[j++] = array[i];
        	 }
         }
         
         array[j++] = array[array.length - 1]; // Add the last element
         int[] copyOf = Arrays.copyOf(array, j);
         System.out.println("The Unique Array:" + Arrays.toString(copyOf));
	 }
}
