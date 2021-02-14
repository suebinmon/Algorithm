package BaekJoon;

import java.util.Scanner;

public class BaekJoon_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] counts = new int['z' - 'a' + 1];
		char[] inputs = s.toCharArray();
		
		for(int i=0; i<counts.length; i++) {
			counts[i] = -1;
		}
		
		for(int i=0; i<inputs.length; i++) {
			int tmp = inputs[i] - 'a';
			if(counts[tmp] == -1)
				counts[tmp] = i;
		}
		
		for(int i=0; i<counts.length; i++) {
			System.out.print(counts[i] + " ");
		}
			
	}
}
