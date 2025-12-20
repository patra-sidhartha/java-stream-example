package com.st.normal.string;

import java.util.Stack;

public class MatheExpBalancedCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isBalanced("(({[]}))[]"));

	}
	
	public static boolean isBalanced(String expr) {
		Stack<Character> stack = new Stack<>();
		
		for (char ch : expr.toCharArray()) {
			
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if (ch == ')' || ch == '}' || ch == ']') {
				if (stack.isEmpty())
					return false;
				char last = stack.pop();
				if ((ch == ')' && last != '(') ||
						(ch == '}' && last != '{') || 
						(ch == ']' && last != '['))
					return false;
			}
		}
		return stack.isEmpty();
	}
}
