import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Random;

public class Sort_11004 {
	static int numOfInt;
	static int k;
	static int[] nums;
	static StringTokenizer st;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		st = new StringTokenizer(br.readLine());

		numOfInt = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		nums = new int[numOfInt];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < numOfInt; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		System.out.println(quickSelection(nums, 0, numOfInt-1, k-1));
	}
	
	public static int quickSelection(final int[] data, int L, int R, int target) {
		int index = partition(data, L, R);
		if (index == target) return data[target];
		else if (index < target) return quickSelection(data, index + 1, R, target);
		else return quickSelection(data, L, index - 1, target);
	}
	
	public static int partition(final int[] data, int L, int R) {
		int pivot = new Random().nextInt(R-L+1);
		swap(data, R, pivot);
		
		int index = L - 1;
		for (int i = L; i < R; i++) {
			if (data[i] < pivot) {
				index++;
				swap(data, i, index);
			}
		}
		swap(data, R, index+1);
		return index;
	}
	
	public static void swap(final int[] data, int a, int b) {
		int tmp = data[a];
		data[a] = data[b];
		data[b] = tmp;
	}

}
