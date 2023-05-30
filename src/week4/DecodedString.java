package week4;

import java.util.Stack;

import org.junit.Test;

public class DecodedString {
	
	@Test
	public void example() {
		String encoded  = "3[a2[bc]]";
		findTheDecoded(encoded);

	}

	private boolean findTheDecoded(String encoded) {
		Stack<Character> stack = new Stack<>();
		for (char c : encoded.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else {
				return false;
			}
		}
		return stack.isEmpty();
	}

}
