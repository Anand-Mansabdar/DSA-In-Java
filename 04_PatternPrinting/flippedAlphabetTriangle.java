// To print a flipped alphabet triangle

// A B C D  (for n=4)
// A B C
// A B
// A

import java.util.Scanner;

public class flippedAlphabetTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=1; j<= n+1-i; j++){
        System.out.print((char)(j+64)+ " ");
      }
      System.out.println();
    }
  }
}