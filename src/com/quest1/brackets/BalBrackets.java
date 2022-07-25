package com.quest1.brackets;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalBrackets {
	String strbrackets;

	/**
	 * @param strbrackets the strbrackets to set
	 */
	public void setStrbrackets(String strbrackets) {
		this.strbrackets = strbrackets;
	}

	public boolean CheckBalanced() {
		// Using ArrayDeque is faster than using Stack class
		Deque<Character> stack = new ArrayDeque<Character>();
		for (int i = 0; i < strbrackets.length(); i++) {
			char x = strbrackets.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				// Push the element in the stack
				stack.push(x);
				continue;
			}
			if (stack.isEmpty())
				return false;

			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}
		 // Check Empty Stack
        return (stack.isEmpty());
	}
}
