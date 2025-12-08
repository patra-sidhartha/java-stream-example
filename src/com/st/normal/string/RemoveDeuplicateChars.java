package com.st.normal.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDeuplicateChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		removeDuplicatesUsingHashSet("abcbabd");
//		removeDuplicatesFrequency("abcbabd");
		removeDuplicatesIndexOf("abcbabd");
	}
	
	public static void removeDuplicatesUsingHashSet(String input) {
		Set<Character> set = new LinkedHashSet<>();
		
		for(char ch: input.toCharArray()) {
			set.add(ch);
		}
		
		StringBuilder sb = new StringBuilder();
		for(char ch: set) {
			sb.append(ch);
		}
		System.out.println(sb.toString());
	}
	
	public static void removeDuplicatesFrequency(String input) {
		boolean [] seen = new boolean[256];
		 StringBuilder result = new StringBuilder();
		 
		for(char ch: input.toCharArray()) {
			if(!seen[ch]) {
				result.append(ch);
				seen[ch] = true;
			}
		}
		System.out.println(result);
	}
	
	public static void removeDuplicatesIndexOf(String input) {
		 StringBuilder result = new StringBuilder();
		 
		 for(char ch: input.toCharArray()) {
			 if(result.indexOf(String.valueOf(ch)) == -1) {
				 result.append(ch);
			 }
		 }
		 
		 System.out.println(result);
	}

}
