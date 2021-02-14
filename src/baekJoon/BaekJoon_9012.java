package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_9012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		VPS vps = new VPS();
		
		int numOfOperators = sc.nextInt();
		String[] operators = new String[numOfOperators];
		sc.nextLine();
		
		for(int i=0; i<operators.length; i++) {
			operators[i] = sc.nextLine();
		}
		sc.close();
		
		for(int i=0; i<operators.length; i++) {
			String input = operators[i];
			if(vps.solve(input))
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}
}

class VPS{
	
	protected boolean solve(String input) {
		Stack<Character> stack = new Stack<Character>();
		
		char[] insertArray = input.toCharArray();
		for(int i=0; i<insertArray.length; i++) {
			if(insertArray[i]=='(') {
				stack.push(insertArray[i]);
			} else {
				if(stack.empty())
					return false;
				else 
					stack.pop();		
			}
		}
		return stack.empty();
	}
}
