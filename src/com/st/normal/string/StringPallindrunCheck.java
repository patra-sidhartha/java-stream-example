package com.st.normal.string;

public class StringPallindrunCheck {
	public static void main(String[] args) {
		pallindrome("Nan");
		
	}
	
	public static void pallindrome(String input) {
		// reverse and compare
		int start = 0;
		int end = input.length()-1;
		
		boolean isPallindrome = true;
		
		while (start < end) {
//			if(input.toLowerCase().charAt(start) != input.toLowerCase().charAt(end)) {
			if(input.charAt(start) != input.charAt(end)) {
				isPallindrome = false;
				break;
			}
			start++;
			end--;
		}
		
		if(isPallindrome) {
			System.out.println("The Input String is Pallindrome:" + input);
		} else {
			System.out.println("The Input String is not Pallindrome:" + input);
		}
	}
}
