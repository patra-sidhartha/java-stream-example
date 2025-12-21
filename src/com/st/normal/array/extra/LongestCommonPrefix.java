package com.st.normal.array.extra;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: strs = ["flower","flow","flight"] Output: "fl"
//		Input: strs = ["dog","racecar","car"] Output: ""
		longestCommonPrefix(new String[] {"flower","flow","flight"});
	}
	
	public static void longestCommonPrefix(String[] strs) {
        char []ch = strs[0].toCharArray();
        String str1 = strs[0];
        String str2 = strs[1];
        String str3 = strs[2];
        String longestPrefix = "";
        for(int i = 0; i<ch.length; i++) {
            String temp = longestPrefix + ch[i];
            if(str1.substring(0, i+1).equals(temp) 
                && str2.substring(0, i+1).equals(temp)
                && str3.substring(0, i+1).equals(temp))
                  longestPrefix = temp;
            else 
                break;
        }
        System.out.println("longestPrefix:" + longestPrefix);
    }
}
