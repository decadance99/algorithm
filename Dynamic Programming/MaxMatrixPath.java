import static java.lang.Math.max; 
  
public class MaxMatrixPath{
	static int findMaxPath(int mat[][]) { 
    	int N = mat.length;
    	int M = mat[0].length;
        int res = mat[0][0];
        System.out.println("INIT RES:" + res);
  
        for (int i = 0; i < N; i++){ 
            res = -1; 
            for (int j = 0; j < M; j++) { 
                if (j == 0 && i != 0) mat[i][j] += mat[i-1][j];
                else if (j == 0 && i == 0) continue;
                else if (i == 0 && j != 0) mat[i][j] += mat[i][j-1];
                else mat[i][j] += max(mat[i - 1][j], max(mat[i - 1][j - 1], mat[i][j - 1])); 

                res = max(mat[i][j], res);
                //System.out.println("i = " + i + ", j = " + j + ", res = " + res);
            } 
        } 
        return res; 
    } 
      
    // driver
    public static void main (String[] args)  
    { 
        int mat[][] = { { 10, 10, 2, 0, 20, 4 }, 
                        { 1, 0, 0, 30, 2, 5 }, 
                        { 0, 10, 4, 0, 2, 0 }, 
                        { 1, 0, 2, 20, 0, 4 }  
                    	}; 
        int mat2[][] = { { 6, 7, 12, 5 }, 
                		{ 5, 3, 11, 18 }, 
                		{ 7, 17, 3, 3 }, 
                		{ 8, 10, 14, 9 }  
        				}; 
        int mat3[][] = { { 1, 2, 3 }, 
        				{ 9, 8, 7 }, 
        				{ 4, 5, 6 } 
        				};
  
        System.out.println(findMaxPath(mat3)); 
    } 
} 