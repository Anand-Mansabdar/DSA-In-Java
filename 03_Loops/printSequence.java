// To print the following sequence by taking input from the user

// 1 n 2 n-1 3 n-2 4 n-3 .....

import java.util.Scanner;

public class printSequence {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n: ");
    int n = sc.nextInt();

    for(int i=0; i<n; i++){
      System.out.println(i+1);
      System.out.println(n-i);
    }
  }
}
