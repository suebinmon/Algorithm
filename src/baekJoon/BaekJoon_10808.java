package baekJoon;

import java.util.Scanner;

public class BaekJoon_10808 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] counts = new int['z' - 'a' + 1];
		char[] inputs = sc.next().toCharArray();
		
		for(int i=0; i<inputs.length; i++) {
			counts[inputs[i] - 'a']++;
		}
		
		for(int i=0; i<counts.length; i++) {
			System.out.print(counts[i] + " ");
		}
	}
}
