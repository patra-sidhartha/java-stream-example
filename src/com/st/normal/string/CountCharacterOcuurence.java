package com.st.normal.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacterOcuurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		numberOfCharacterOccurrence("abdmshamndhabbs");
		numberOfCharacterOccurrenceByCounter("abdmshamndhabbs");

	}
	
	public static void numberOfCharacterOccurrence(String input) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(char ch: input.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "---" + entry.getValue());
		}
	}
	
	public static void numberOfCharacterOccurrenceByCounter(String input) {
		int []charsCount = new int[256];
		
		for(char ch: input.toCharArray()) {
			charsCount[ch]++;
		}
		
//		The code uses a standard for loop (for (int i = 0; i < counts.length; i++)) to access both the character (via the index) and its corresponding count (via the value at that index).
//		A "for-each" loop (for (int i : counts)) only gives you the value stored at each position in the array.
//		for(int i: charsCount) --> will not work
			
		for(int i = 0; i < charsCount.length; i++) {
			if(charsCount[i] > 0) {
				 System.out.println((char) i + " : " + charsCount[i]);
			}
		}
	}
}
