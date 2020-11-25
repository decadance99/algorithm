// 3. Recursive Squaring
// Time Complexity: O(1)

import java.util.Scanner;

class fib3 {
  
  static int fib(int n) { 
    double x = (1 + Math.sqrt(5)) / 2; 
    return (int) Math.round(Math.pow(x, n) / Math.sqrt(5)); 
  } 
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(fib3(n)); 
  } 
}
