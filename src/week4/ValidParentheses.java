package week4;

import java.util.HashMap;
import java.util.Stack;

import org.junit.Test;

public class ValidParentheses {

	@Test
	public void example() {
		String s = "()";
		System.out.println(checkParentheses(s));

	}

	@Test
	public void example1() {
		String s = "()";
		System.out.println(checkParentheses(s));

	}

	@Test
	public void example2() {
		String s = "(((";
		System.out.println(checkParentheses(s));

	}

	@Test
	public void example3() {
		String s = "[]{}({})";
		System.out.println(checkParentheses(s));

	}

	@Test
	public void example4() {
		String s = "[()]))()";
		System.out.println(checkParentheses(s));

	}

	@Test
	public void example5() {
		String s = "{]";
		System.out.println(checkParentheses(s));

	}

	@Test
	public void example6() {
		String s = "(()())";
		System.out.println(checkParentheses(s));

	}

	@Test
	public void example7() {
		String s = "[{}]";
		System.out.println(checkParentheses(s));

	}

	// []{}({})

	private boolean checkParentheses(String s) {

		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
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

	public boolean checkParentheses1(String s) {

		HashMap<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');

		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (map.containsKey(c)) {

				stack.push(c);
			} else if (map.containsValue(c)) {

				if (!stack.isEmpty() && map.get(stack.peek()) == c) {
					stack.pop();
				} else {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
}
