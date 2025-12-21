package com.st.normal.array.extra;

public class FindMedianSortedArrays {
	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] {1,3}, new int[] {2}));
		System.out.println(findMedianSortedArrays(new int[] {1, 2}, new int[] {3, 4}));
		
	}
	 public static double findMedianSortedArrays(int[] a, int[] b) {
	        int c[] = new int[a.length + b.length];
	        int k =0,  i = 0, j = 0;
	        while(i < a.length && j < b.length) {
	            if(a[i] == b[j] || a[i] < b[j]) {
	                c[k++] = a[i++];
	            } else {
	                c[k++] = b[j++];
	            }
	        }

	        while(i < a.length) {
	             System.out.print(i + " ");
	            c[k++] = a[i++];

	        }
	        while(j < b.length) {
	            c[k++] = b[j++];
	        }
	            

	       for (int num: c) {
	        System.out.print(num + " ");
	       }
	        if(c.length%2 == 0) {
	            int mid = c.length/2;
	            return (double) (c[mid-1] + c[mid])/2;
	        } else {
	             int mid = c.length/2;
	            return c[mid];
	        }
	    }
}
