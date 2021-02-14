package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_10799 {

	public static int stack(String iron) throws Exception{
		int cnt = 0;
		Stack<Integer> s = new Stack<Integer>();

		try {
			for(int i=0; i<iron.length(); i++) {
				if(iron.charAt(i)=='(') {
					s.push(1);
				}
				if(iron.charAt(i)==')') {
					if(iron.charAt(i-1)=='(') {
						s.pop();
						cnt += s.size();
					}
					else {
						cnt += 1;
						s.pop();
					}
				}
			}
		} catch(Exception e) {
		//	e.printStackTrace();
			System.out.println("( ���� �Է��� �ּ���.");
		}
		return cnt;
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String iron = sc.nextLine();

		int result = stack(iron);
		System.out.println(result);


	}
}
