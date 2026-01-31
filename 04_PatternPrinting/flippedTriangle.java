// To print a flipped star triangle pattern

// * * * * 
// * * *
// * *
// *

import java.util.Scanner;

public class flippedTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=n; j>=i; j--){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
