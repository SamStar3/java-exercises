package HackerRankDSA;

import java.util.Stack;

public class Solution9 {

	public static boolean balanced(String str) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char x = str.charAt(i);
			if (x == '{' || x == '[' || x == '(') {
				stack.push(x);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			switch (x) {
			case ')':
				if (!stack.peek().equals('('))
					return false;
				stack.pop();
				break;
			case ']':
				if (!stack.peek().equals('['))
					return false;
				stack.pop();
				break;
			case '}':
				if (!stack.peek().equals('{'))
					return false;
				stack.pop();
				break;
			}
		}
		return stack.isEmpty();

	}

	public static void main(String[] arg) {

		String str = "({(){}()})()({(){}()})(){()}{}((()))";
		if (balanced(str)) {
			System.out.println("It's Balanced");
		} else {
			System.out.println("It's Not Balanced");
		}

	}

}
