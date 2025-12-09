package com.st.normal.array.manipulation;

public class ReverseArray {
	public static void main(String[] args) {
		// Reverse an array (in-place) or rotate it
		 reverseArray(new int[] {10,20,30,40});
	}
	
	 public static void reverseArray(int[] array) {
		 int start = 0;
		 int end = array.length -1;
		 System.out.println("Original Array:" + java.util.Arrays.toString(array));
		 while(start < end) {
			 int temp = array[start];
			 array[start] = array[end];
			 array[end] = temp;
			 start++;
			 end--;
		 }
		
		 System.out.println("Revese Array:" + java.util.Arrays.toString(array));
	 }
}
