package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class BOJ_5397 {

	private static int point;
	private static List<Character> list;
	private static String s;

	public static void plusPoint() {
		if(point == list.size()) return;
		point++;
	}
	
	public static void minusPoint() {
		if(point == 0) return;
		point--;
	}

	public static void remove() {
		if (point == 0) return;
		point--;
		list.remove(point);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int num = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= num; i++) {
			
			s = br.readLine();
			list = new LinkedList<Character>();
			point = 0;

			for (int forAll = 0; forAll < s.length(); forAll++) {
				char curChar = s.charAt(forAll);
				switch (curChar) {
				case '<':
					minusPoint();
					break;
				case '>':
					plusPoint();
					break;
				case '-':
					remove();
					break;
				default:
					list.add(point, curChar);
					point++;
					break;
				}
			}

			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j));
			}
		}
	}
}