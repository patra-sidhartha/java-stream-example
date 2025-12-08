package com.st.normal.string;

public class SpecificCharNoOfOccurence {
	public static void main(String[] args) {
		String input = "programming is fun";
        char target = 'g';
        countTargetCharacterUsingAPI(input, target);
        countTargetCharacter(input, target);
       
	}

	public static void countTargetCharacterUsingAPI(String input, char target) {
		String targetStr = String.valueOf(target);
		int count = input.length() - input.replace(targetStr, "").length();
		System.out.println("The character '" + target + "' appears " + count + " times.");
	}

	public static void countTargetCharacter(String input, char target) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == target) {
				count++;
			}
		}

		System.out.println("The character '" + target + "' appears " + count + " times.");
	}
}
