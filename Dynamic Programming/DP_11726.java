import java.util.*;

public class DP_11726 {
	public static void main(String[] args) {
		System.out.println("Enter the number of rows: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] d = new int[1001];
		d[1] = 1;
		d[2] = 2;
		
		for(int i = 3; i <= n; i++)
			d[i] = (d[i-1] + d[i-2]);
		System.out.println(d[n]);
		in.close();
    }
}