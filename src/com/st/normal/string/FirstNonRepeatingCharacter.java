package com.st.normal.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(firstNonRepeatingCharUsingfor("abcebad"));
//		System.out.println(findFirstNonRepeatingUsingFrequency("abcebad"));
//		System.out.println(findFirstNonRepeatingIndexOf("abcebad"));
		System.out.println(findFirstNonRepeatingLinkedHashMap("abcebad"));
	}
	
	public static char firstNonRepeatingCharUsingfor(String input) {
		char chars[] = input.toCharArray();
		char firstNonRepChar = 0;
		for(int i=0; i< chars.length; i++) {
			int count = 0;
			for(int j = i+1; j < chars.length; j++) {
				if(chars[i] == chars[j]) {
					count++;
					break;
				}
			}
			if(count == 0) {
				firstNonRepChar = chars[i];
				break;
			}
		}
		return firstNonRepChar;
	}
	
	public static Character findFirstNonRepeatingUsingFrequency(String input) {
		int charCount[] = new int[256]; //// Assuming ASCII characters
		
		for(char ch: input.toCharArray()) {
			charCount[ch]++;
		}
		
		for(char ch: input.toCharArray()) {
			if(charCount[ch] == 1) {
				return ch;
			}
		}
		return null;
	}
	
	public static Character findFirstNonRepeatingIndexOf(String input) {
		for(int i=0; i< input.length(); i++) {
			char ch = input.charAt(i);
			if(input.indexOf(ch) == input.lastIndexOf(ch)) {
				return ch;
			}
		}
		return null;
	}
	
	public static Character findFirstNonRepeatingLinkedHashMap(String input) {
		Map<Character, Integer> charCountMap = new LinkedHashMap<>();
		for(char ch: input.toCharArray()) {
			charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry: charCountMap.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;
	}
}
