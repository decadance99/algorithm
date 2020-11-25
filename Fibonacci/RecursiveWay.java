// 1. Recursive
// Time complexity: O(2^n)

import java.util.Scanner;

class fib1 { 
  static int fib1(int n) { 
    if (n == 1 || n ==2) return n; 
    else return fib1(n-1) + fib1(n-2); 
    }
  public static void main (String args[]) { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(fib1(n)); 
  } 
}
