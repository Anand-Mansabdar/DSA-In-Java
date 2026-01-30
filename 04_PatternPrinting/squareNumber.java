// To print a squared number pattern as follows:

// 1 2 3 4
// 1 2 3 4
// 1 2 3 4
// 1 2 3 4

import java.util.Scanner;

public class squareNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows and columns: ");
    int n = sc.nextInt();

    for(int i=0; i<n; i++){
      for(int j=1; j<=n; j++){
        System.out.print(+j+" ");
      }
      System.out.println();
    }
  }
}
