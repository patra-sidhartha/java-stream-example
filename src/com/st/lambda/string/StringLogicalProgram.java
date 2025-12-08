package com.st.lambda.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringLogicalProgram {
	public static void main(String[] args) {
		// Reverse of String
//		reverseString("name123");
		
		// Group characters by their value and count occurrences, preserving order
		findFirstNonRepeatingChar("abcabsv");
		
	}
	
	public static void reverseString(String input) {
		if(null == input || input.isEmpty() || input.length() == 1 ) {
			System.out.println(input);
			return;
		}
		
		 String rev = IntStream.range(0, input.length())
		  .mapToObj(i -> input.charAt(input.length() - 1 - i)) // Map to characters in reverse order
          .collect(StringBuilder::new, 
        		  StringBuilder::append, 
        		  StringBuilder::append) // Collect into a StringBuilder
          .toString(); // Convert StringBuilder to String
		 System.out.println(rev);
		 	
	}
	
	 public static void findFirstNonRepeatingChar(String input) {
		 if(null == input || input.isEmpty() || input.length() == 1 ) {
				System.out.println(input);
				return;
			}
		 
		 Map<Character, Long> repeatCharMap = input.chars()
		 	.mapToObj(c -> (char) c)
		 	.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
		System.out.println(repeatCharMap);
		
		Optional<Character> first = repeatCharMap.entrySet().stream().filter(entry -> entry.getValue() ==1)
			.map(Map.Entry::getKey).findFirst();
		System.out.println(first.get());
	 }

	 public static void isAnagramByFrequency(String input1, String input2) {
		 
	 }
}
