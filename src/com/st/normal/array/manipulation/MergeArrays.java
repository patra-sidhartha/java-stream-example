package com.st.normal.array.manipulation;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {
	public static void main(String[] args) {
		// Merge two sorted arrays
//		 mergUsingAuxiliary(new int[] {30,50,10}, new int[] {60,20,40});
		 mergeSortedArraysStream(new int[] {30,50,10}, new int[] {60,20,40});
	}
	
	public static void mergUsingAuxiliary(int[] array1, int[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		int []mergedArray = new int[array1.length + array2.length];
		
		int i = 0, j=0, k=0;
		
		while(i < array1.length && j < array2.length) {
			if(array1[i] < array2[j]) {
				mergedArray[k++] = array1[i++];
			} else {
				mergedArray[k++] = array2[j++];
			}
		}
		
		while(i < array1.length)
			mergedArray[k++] = array1[i++];
		while(j < array2.length)
			mergedArray[k++] = array2[j++];
		
		System.out.println("Merged Sorted Array:" + Arrays.toString(mergedArray));
		
	}
	
	public static void mergeSortedArraysStream(int[] arr1, int[] arr2) {
         int[] array = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                        .sorted()
                        .toArray();
         System.out.println("Merged Sorted Array:" + Arrays.toString(array));
    }
}
