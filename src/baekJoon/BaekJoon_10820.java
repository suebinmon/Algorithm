package BaekJoon;

import java.io.IOException;
import java.util.Scanner;

public class BaekJoon_10820 {
	public static void main(String[] args) throws IOException {

		int nSmall, nBig, nNum, nSpace;
		char[] S;

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
/*		String inputs = sc.next();
		char[] S = inputs.toCharArray();*/
		
		while(sc.hasNextLine()) {

			nSmall = 0;
			nBig = 0;
			nNum = 0;
			nSpace = 0;

			S = sc.nextLine().toCharArray();

			for (int j = 0; j < S.length; j++) {

				if (S[j] >= 'a' && S[j] <= 'z') {

					nSmall++;
				}

				if (S[j] >= 'A' && S[j] <= 'Z') {

					nBig++;
				}

				if (S[j] >= '0' && S[j] <= '9') {

					nNum++;
				}

				if (S[j] == ' ') {

					nSpace++;
				}

			}
			sb.append(nSmall + " " + nBig + " " + nNum + " " + nSpace + "\n");
		}

		System.out.println(sb);
		sc.close();
	}
}
