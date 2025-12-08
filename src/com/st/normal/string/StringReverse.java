package com.st.normal.string;

public class StringReverse {
	public static void main(String[] args) {
//		reverseStringWithLoop("Name");
//		reverseStringWithCharArray("Name123");
//		System.out.println("Rev:" + reverseStringWithRecursion("Name123"));
		
		// With reverse function
		String name = "sid";
		StringBuilder sb = new StringBuilder(name);
		System.out.println("rev:" + sb.reverse());
	}
	
	public static void reverseStringWithLoop(String input) {
		String rev = "";
		for(int i = input.length()-1; i >=0; i--) {
			rev += input.charAt(i);
		}
		System.out.println("Reverse String is:" + rev);
	}
	
	public static void reverseStringWithCharArray(String input) {
		char[] chars = input.toCharArray();
		int startIndex = 0;
		int endIndex = input.length()-1;
		
		while(startIndex < endIndex) {
			char temp = chars[startIndex];
			chars[startIndex] = chars[endIndex];
			chars[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
		System.out.println("Reverse String: " + new String(chars));
	}
	
	public static String reverseStringWithRecursion(String input) {
		System.out.println(input);
		if(null == input || input.length() <= 1) {
			return input;
		}
		return reverseStringWithRecursion(input.substring(1)) + input.charAt(0);
	}
}
