package com.st.normal.string;

import java.util.Arrays;
import java.util.HashMap;

public class StringAnagram {
	public static void main(String[] args) {
//		System.out.println(areAnagramsUsingSorting("act", "c at"));
		System.out.println(areAnagramsUsingFrequencyArray("act", "c at"));
	}
	
	public static boolean areAnagramsUsingSorting(String input1, String input2) {
		String s1= input1.replaceAll("\s", "").toLowerCase();
		String s2 = input2.replace("\s", "").toLowerCase();
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] charArrayS1 = s1.toCharArray();
		char[] charArrayS2 = s2.toCharArray();
		Arrays.sort(charArrayS1);
		Arrays.sort(charArrayS2);
		
		return Arrays.equals(charArrayS1, charArrayS2);
	}
	
	public static boolean  areAnagramsUsingFrequencyArray(String input1, String input2) {
		String s1= input1.replaceAll("\s", "").toLowerCase();
		String s2 = input2.replace("\s", "").toLowerCase();
		
		System.out.println(s1);
		System.out.println(s2);
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		 int[] charCounts = new int[256]; // Assuming ASCII characters
		 
		 for(char ch : s1.toCharArray()) {
			 charCounts[ch]++;
		 }
		 
		 for(char ch : s2.toCharArray()) {
			 charCounts[ch]--;
		 }
		 
		 for(int count: charCounts) {
			 if(count != 0) {
				 return false;
			 }
		 }
		 
		 return true;
	}
	
	
	public static boolean areAnagramsUsingHashMap(String str1, String str2) {
        String s1 = str1.replaceAll("\s", "").toLowerCase();
        String s2 = str2.replaceAll("\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char c : s1.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (char c : s2.toCharArray()) {
            if (!charCounts.containsKey(c) || charCounts.get(c) == 0) {
                return false; // Character not found or count already zero
            }
            charCounts.put(c, charCounts.get(c) - 1);
        }

        // Optional: Verify all counts are zero (already implicitly handled if no negative counts occurred)
        for (int count : charCounts.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
	
}
