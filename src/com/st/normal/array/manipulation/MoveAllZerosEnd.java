package com.st.normal.array.manipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZerosEnd {
	public static void main(String[] args) {
		// Move all zeros to the end or arrange positive/negative numbers alternately
//		moveZerosToEnd(new int [] {10,0,30,00,40});
//		moveZerosToEndTempArray(new int [] {10,0,30,00,40});
		
//		Arranging Positive and Negative Numbers Alternately in Java
		rearrangeArray(new int [] {10,-4,30,-2,40});
	}
	
	public static void moveZerosToEnd(int []array) {
		int nonZeroIndex = 0;
		System.out.println("Orginal Array:" + Arrays.toString(array));
		for(int i=0; i < array.length; i++) {
			if(array[i] != 0) {
				array[nonZeroIndex] = array[i];
				nonZeroIndex++;
			}
		}
		
		for(int i = nonZeroIndex; i< array.length; i++ ) {
			array[i] = 0;
		}
		System.out.println("After Move Array:" + Arrays.toString(array));
	}
	
	public static void moveZerosToEndTempArray(int []array) {
		int []tempArray = new int[array.length];
		int start =0;
		System.out.println("Orginal Array:" + Arrays.toString(array));
		for(int num: array) {
			if(num != 0) {
				tempArray[start] = num;
				start++;
			}
		}
		System.out.println("After Move Array:" + Arrays.toString(tempArray));
	}
	
	public static void rearrangeArray(int[] array) {
		List<Integer> positives = new ArrayList<>();
		List<Integer> negatives = new ArrayList<>();
		
		for(int num: array) {
			if(num > 0) {
				positives.add(num);
			} else {
				negatives.add(num);
			}
		}
		
		 int[] result = new int[array.length];
	     int posIndex = 0;
	     int negIndex = 0;
	     
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) { // Even index, place positive
				result[i] = positives.get(posIndex++);
			} else { // Odd index, place negative
				System.out.println(i);
				result[i] = negatives.get(negIndex++);
			}
		}
		System.out.println("Rearrange Array:" + Arrays.toString(result));
	        
	}
}
