package com.st.normal.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindingArrayElements {
	public static void main(String[] args) {
		// Programs are moved to diff clases
		// Find the largest and smallest element in an unsorted array
		
//		findMinMax(new int[] {30,20,50,10,60,40});
//		minMaxFinderSorted(new int[] {30,20,50,10,60,40});
//		minMaxFinderCollections(new int[] {30,20,50,10,60,40});
//		minMaxFinderStream(new int[] {30,20,50,10,60,40});
		
		// Find the 2nd/kth smallest element
		
		
		// Find duplicate numbers or a single unique element in array with duplicates
		// Find a pair of elements that sum to given target.
	}
	
	public static void findMinMax(int[] array) {
		if(array == null || array.length == 0) {
			System.out.println("Array is null or empty");
			return;
		}
		
		int max = array[0];
		int min = array[0];
		
		for(int i = 1; i< array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("Min:" + min);
		System.out.println("Max:" + max);
	}
	
	public static void minMaxFinderSorted (int[] array) {
		if(array == null || array.length == 0) {
			System.out.println("Array is null or empty");
			return;
		}
		Arrays.sort(array);

		System.out.println("Min:" + array[0]);
		System.out.println("Max:" + array[array.length-1]);
	}
	
	public static void minMaxFinderCollections(int[] array) {
		 List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

		if (list == null || list.isEmpty()) {
            System.out.println("List is empty or null.");
            return;
        }
		
		System.out.println("Min:" + Collections.min(list));
		System.out.println("Max:" + Collections.max(list));
	}
	
	public static void  minMaxFinderStream(int[] array) {
		if(array == null || array.length == 0) {
			System.out.println("Array is null or empty");
			return;
		}
		
		int min = Arrays.stream(array).min().getAsInt();
		int max = Arrays.stream(array).max().getAsInt();
		
		System.out.println("Min:" + min);
		System.out.println("Max:" + max);
	}
}
