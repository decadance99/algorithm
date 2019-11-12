import java.io.*;
import java.util.Arrays;

public class DP_9252 {
	public static int len1, len2, dp[][];
	public static String[] word = new String[2], lcs[];
	
	public static void main(String[] args) throws Exception {
		System.out.println("Enter two words: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		word[0] = in.readLine();
		word[1] = in.readLine();
		len1 = word[0].length();
		len2 = word[1].length();
		
		dp = new int[len1+1][len2+1];
		lcs = new String[len1+1][len2+1];
		
		for (int i = 0; i <= len1; i++) Arrays.fill(lcs[i], "");
		
		getLCS();
		
		out.write(dp[len1][len2] + "\n" + lcs[len1][len2]);
		out.close();
		in.close();
	}
	
	private static void getLCS() {
		for (int i = 1; i <= len1; i++) {
			for (int j = 1; j <= len2; j++) {
				if(word[0].charAt(i-1) == word[1].charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1] + 1;
					lcs[i][j] += lcs[i-1][j-1] + word[0].charAt(i-1);
				} else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					if (lcs[i-1][j].length() > lcs[i][j-1].length()) lcs[i][j] = lcs[i-1][j];
					else lcs[i][j] = lcs[i][j-1];
				}
			}
		}
	}
}
