package com.st.normal.array.find;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindingSecondOrKthArrayElements {

	public static void main(String[] args) {
		// Find the 2nd/kth smallest element
		
//		findSecondSmallest(new int[] {30,20,50,10,60,40});
//		findSecondSmallestUsingSort(new int[] {30,20,50,10,60,40});
//		kthSmallestSorted(new int[] {30,20,50,10,60,40}, 4);
		kthSmallestUsingQueue(new int[] {30,20,50,10,60,40}, 4);
	}
	
	public static void findSecondSmallest(int[] array) {
		if(array == null || array.length < 2) {
			throw new IllegalArgumentException("Array must contain at least two elements.");
		}
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int num: array) {
			if(num < smallest) {
				secondSmallest = smallest;
				smallest = num;
			} else if(num < secondSmallest && num != smallest) {
				secondSmallest = num;
			}
		}
		System.out.println("Second smallest number:" + secondSmallest);
	}
	
	public static void findSecondSmallestUsingSort(int[] array) {
		if(array == null || array.length < 2) {
			throw new IllegalArgumentException("Array must contain at least two elements.");
		}
		
		Arrays.sort(array);
		System.out.println("Second smallest:" + array[1]);
	}
	
	public static void kthSmallestSorted(int[] array, int k) {
		if (array == null || k <= 0 || k > array.length) {
            throw new IllegalArgumentException("Invalid input for k-th smallest.");
        }
		
		Arrays.sort(array);
		System.out.println("Kth smallest Ele:" + array[k - 1]);
	}
	
	public static void kthSmallestUsingQueue(int[] array, int k) {
		if (array == null || k <= 0 || k > array.length) {
            throw new IllegalArgumentException("Invalid input for k-th smallest.");
        }
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int num: array) {
			minHeap.add(num);
		}
		
		for (int i = 0; i < k - 1; i++) {
            minHeap.poll(); // Remove k-1 smallest elements
        }
		
		System.out.println("Kth smallest Ele:" + minHeap.poll());
	}
}
