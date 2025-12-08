package com.st.normal.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordInSetence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseSenteceNormal("Java is    Best");
		reverseSentenceSB("Java is    Best");
		reverseSentenceCollections("Java is    Best");

	}
	
	public static void reverseSenteceNormal(String input) {
		String[] words = input.split("\s");
		
		String revSetence = "";
		for(int i= words.length-1; i >= 0; i--) {
			if(words[i] != "")
				revSetence += words[i] + " "; 
		}
		System.out.println(revSetence.trim());
	}
	
	public static void reverseSentenceSB(String input) {
        String[] words = input.split(" "); 
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
        	if(words[i] != "")
        		reversedSentence.append(words[i]).append(" ");
        }
        System.out.println(reversedSentence.toString().trim());
    }
	
	public static void reverseSentenceCollections(String input) {
		List<String> asList = Arrays.asList(input.split(" "));
		Collections.reverse(asList);
		System.out.println(String.join(" ", asList));
	}
}
