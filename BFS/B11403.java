package day4;

import java.util.Scanner;

public class B11403 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k, n = sc.nextInt(), d[][] = new int[n+1][n+1];
		int inf = 100;
		
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				d[i][j] = sc.nextInt();
				if (d[i][j] == 0) d[i][j] = inf;
			}
		}
		for (k = 1; k <= n; k++) {
			for (i = 1; i <= n; i++) {
				for (j = 1; j <= n; j++) {
					if (d[i][j] > d[i][k] + d[k][j])
						d[i][j] = d[i][k] + d[k][j];
				}
			}
		}
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n; j++) {
				System.out.printf("%d", d[i][j] == inf ? 0:1);
			}
			System.out.println();
		}
		sc.close();
	}
}
