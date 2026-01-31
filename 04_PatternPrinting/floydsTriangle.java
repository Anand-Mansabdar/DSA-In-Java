// Program to print the following triangle

// 1         (for n=4)
// 2 3
// 4 5 6
// 7 8 9 10

import java.util.Scanner;

public class floydsTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();
    int x = 1;

    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        System.out.print(x + " ");
        x++;
      }
      System.out.println();
    }
  }
}
