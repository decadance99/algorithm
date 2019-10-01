import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Sort_11004_sort {
	static int numOfInt;
	static int k;
	static int[] nums;
	static StringTokenizer st;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());

		numOfInt = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		nums = new int[numOfInt];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numOfInt; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(nums);
		System.out.println(nums[k-1]);

	}

}
