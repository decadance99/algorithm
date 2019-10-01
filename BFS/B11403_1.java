package day4;

import java.util.Scanner;

public class B11403_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, n = sc.nextInt(), d[][] = new int[n+1][n+1];
		
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				d[i][j] = sc.nextInt();
			}
		}
		for (k = 1; k <= n; k++) {
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= n; j++) {
					if (d[i][k] == 1 && d[k][j] == 1)
						d[i][j] = 1;
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				System.out.printf("%d ", d[i][j] == 0 ? 0:1);
			}
			System.out.println();
		}
		sc.close();
	}
}
