// 2. Bottom-Up
// Time Complexity: O(n)

import java.util.Scanner;

class fib2 { 

  static int fib(int n) { 
    int f[] = new int[n+2];
    int i; 
    f[0] = 0; 
    f[1] = 1; 
  
    for (i = 2; i <= n; i++) { 
      f[i] = f[i-1] + f[i-2]; 
    } 
    return f[n]; 
   } 
       
  public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(fib2(n)); 
  } 
}     
