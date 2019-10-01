package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_5397_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int num = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < num; i++) {
			char[] c = br.readLine().toCharArray();
			Stack<Character> A = new Stack<Character>();
			Stack<Character> tempS = new Stack<Character>();

			for (int forAll = 0; forAll < c.length; forAll++) {
				char curC = c[forAll];
				switch (curC) {
				case '<':
					if (!A.isEmpty()) {
						tempS.push(A.pop());
					}
					break;

				case '>':
					if (!tempS.isEmpty()) {
						A.push(tempS.pop());
					}
					break;

				case '-':
					if (!A.isEmpty()) A.pop();
					break;

				default:
					A.push(curC);
					break;
				}
			}
			
			int tempSize = A.size();
			System.out.println("tempSize 1: " + tempSize);
			for (int j = 0; j < tempSize; j++) {
				char temp = A.pop();
				System.out.println(temp);
				tempS.push(temp);
			}
			
			StringBuilder sb = new StringBuilder();
			tempSize = tempS.size();
			System.out.println("tempSize 2: " + tempSize);
			for (int j = 0; j < tempSize; j++) {
				sb.append(tempS.pop());
			}
			
			System.out.println(sb.toString());
		}
	}
}