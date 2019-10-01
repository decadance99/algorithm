import java.io.*;

public class Sort_10989 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[10001];
		
		for (int i = 0; i < n; i++) {
			arr[Integer.parseInt(br.readLine())]++;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i = 1; i < 10001; i++) {
			while (arr[i]-- > 0) {
				bw.write(Integer.toString(i) + "\n");
			}
		}
		bw.close();
		br.close();
	}

}
