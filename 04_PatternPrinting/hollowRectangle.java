// To print a hollow rectangle

// * * * * * * * * * (for rows=4 and columns =9)
// *               *
// *               *
// * * * * * * * * *

import java.util.Scanner;

public class hollowRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    int rows = sc.nextInt();
    System.out.println("Enter the number of columns: ");
    int cols = sc.nextInt();

    for(int i=1; i<=rows; i++){
      for(int j=1; j<=cols; j++){
        if(i==1 || i==rows || j==1 || j==cols){
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
