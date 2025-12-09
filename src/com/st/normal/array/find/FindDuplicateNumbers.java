package com.st.normal.array.find;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		// Find duplicate numbers or a single unique element in array with duplicates
//		findDuplicatesNestedLoops(new int[] {20,10,30,50,20,40,30});
//		findDuplicatesWithCounts(new int[] {20,10,30,50,20, 20,40,30});
//		findDuplicatesUsingHashSet(new int[] {20,10,30,50,20, 20,40,30});
//		findDuplicatesWithStreams(new int[] {20,10,30,50,20, 20,40,30});
		
		findFirstUniqueUsingHashMap(new int[] {20,10,30,50,20, 20,40,30});
		findFirstUnique(new int[] {20,10,30,50,20, 20,40,30});
	}
	
	public static void findDuplicatesNestedLoops(int[] array) {
		System.out.println("Duplicate Numbers are: ");
		for(int i = 0; i< array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i] == array[j]) {
					System.out.print(array[i] + " ");
					break;
				}
			}
		}
	}
	
	 public static void findDuplicatesWithCounts(int[] array) {
		 // check the size > 1 or not null
		 
		 Map<Integer, Integer> map = new HashMap<>();
		 for(int num: array) {
			 map.put(num, map.getOrDefault(num,0) + 1);
		 }
		 
		 for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			 if(entry.getValue()>1) {
				 System.out.println(entry.getKey() + "---" + entry.getValue());
			 }
		 }
	 }
	 
	  public static void findDuplicatesUsingHashSet(int[] array) {
		  Set<Integer> uniqueElements = new HashSet<>();
	      Set<Integer> duplicates = new HashSet<>();
	      
	      for(int num: array) {
	    	  if(!uniqueElements.add(num)) {
	    		  duplicates.add(num);
	    	  }
	      }
	      
	      System.out.println("Duplicated are: " + duplicates);
	  }
	  
	  public static void findDuplicatesWithStreams(int[] arr) {
	        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
	        Set<Integer> unique = new HashSet<>();
	        Set<Integer> duplicates = list.stream()
	                                     .filter(n -> !unique.add(n)) // Add returns false if element already exists
	                                     .collect(Collectors.toSet());
	        System.out.println("Duplicate elements (Streams): " + duplicates);
	    }
	  
	  public static void findFirstUnique(int[] array) {
		  Set<Integer> uniqueElements = new HashSet<>();
	      Set<Integer> duplicates = new HashSet<>();
	      
	      for(int num: array) {
	    	  if(!uniqueElements.add(num)) {
	    		  duplicates.add(num);
	    	  }
	      }
	      
	      for(int num: array) {
	    	  if(!duplicates.contains(num)) {
	    		  System.out.println("The first unique: " + num);
	    		  break;
	    	  }
	      }
	  }
	  
	  public static void findFirstUniqueUsingHashMap(int[] arr) {
	        // LinkedHashMap preserves the order of insertion
	        Map<Integer, Integer> frequencyMap = new LinkedHashMap<>();

	        // First pass: Count the frequency of each element
	        for (int num : arr) {
	            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
	        }

	        // Second pass: Iterate through the map entries in insertion order
	        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
	            if (entry.getValue() == 1) {
	                System.out.println("The first unique: " + entry.getKey()); // Return the first element with a count of 1
	                break;
	            }
	        }

	    }
}
