// To print the following pattern - Vertically Flipped Alphabetical Triangle

//       A 
//     B B 
//   C C C 
// D D D D (for n=4)

import java.util.Scanner;

public class VerticallyFlippedAlphabetTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print("  ");
      }

      for(int j=1; j<=i; j++){
        System.out.print((char)(i+64)+ " ");
      }
      System.out.println();
    }
  }
}
