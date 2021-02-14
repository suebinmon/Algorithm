package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_10828 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CustomStack stack = new CustomStack();

		int numOfOperators = scanner.nextInt();
		String[] operators = new String[numOfOperators];
		scanner.nextLine(); // flush

		for(int i = 0; i < operators.length; i++) {
			operators[i] = scanner.nextLine();
		}
		scanner.close();

		for(int i = 0; i < operators.length; i++) {
			if(operators[i].contains(" ")) {
				stack.push(Integer.parseInt(operators[i].split(" ")[1]));
			} else {
				switch(operators[i]) {
				case "pop":
					System.out.println(stack.pop());
					break;
				case "size":
					System.out.println(stack.getSize());
					break;
				case "empty":
					System.out.println(stack.isEmpty());
					break;
				case "top":
					System.out.println(stack.getTop());
				}
			}
		}
	}

}


class CustomStack {
	private Stack<Integer> stack = new Stack<Integer>();

	protected void push(int x) {
		stack.add(x);
	}

	protected int pop() {
		if(stack.isEmpty()) {
			return -1;
		} else {
			return (int) stack.pop();
		}
	}

	protected int getSize() {
		return stack.size();
	}

	protected int isEmpty() {
		if(stack.isEmpty()) {
			return 1;
		} else {
			return 0;
		}
	}

	protected int getTop() {
		if(stack.isEmpty()) {
			return -1;
		} else {
			return stack.peek();
		}
	}
}
