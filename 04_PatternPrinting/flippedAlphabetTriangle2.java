// To print the following pattern

// A A A A (for n=4)
// B B B
// C C
// D

import java.util.Scanner;

public class flippedAlphabetTriangle2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n+1-i; j++){
        System.out.print((char)(i+64)+ " ");
      }
      System.out.println();
    }
  }
}
