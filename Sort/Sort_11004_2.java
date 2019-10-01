import java.util.Random;
import java.io.*;
import java.util.StringTokenizer;

public class Sort_11004_2 {
    static StringTokenizer st;
    static int N, K, tmp;
    static int[] array;
    
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		array = new int[N];
        
        st = new StringTokenizer(br.readLine());
		for(int idx = 0; idx < N; idx++){
			array[idx] = Integer.parseInt(st.nextToken());
		}
		int a = quickSelect(array, 0, array.length-1, K-1);
		try {
			bw.write(String.valueOf(a));
		} finally {
			bw.flush();
			bw.close();
		}
	}
	
	public static int quickSelect(final int[] array, int start, int end, int K){ //K는 찾고자하는 수의 인덱스.
		int pivot = partition(array, start, end);			
		if(pivot == K) return array[K];
		else if(pivot > K) return quickSelect(array, start, pivot-1, K); //왼쪽 탐색.
		else return quickSelect(array, pivot+1, end, K);  //K가 더 크면 오른쪽 탐색.
	}
	
	public static int partition(final int[] array, int start, int end){
		int pivot = start + new Random().nextInt(end-start+1);
		System.out.println("PIVOT: " + pivot);
		swap(array, end, pivot);
		System.out.println("AFTER 1ST " +array[0]+array[1]+array[2]);
		
		int i = start - 1;
		int c = array[end];
		
		for (int j = start; j < end; j++){
			if (array[j] < c) {
				i++;
				swap(array, i, j);
				System.out.println("AFTER 2ND " +array[0]+array[1]+array[2]);
			}
		}
		swap(array, i+1, end);
		System.out.println("AFTER 3ND " +array[0]+array[1]+array[2]);
		System.out.println(i+1);
		return i+1;
		
	}

	public static void swap(final int[] array, int a, int b){
		tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
	}
}