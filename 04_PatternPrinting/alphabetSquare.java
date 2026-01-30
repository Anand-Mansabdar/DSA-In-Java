// To print the following pattern

// A B C D 
// A B C D 
// A B C D 
// A B C D

import java.util.Scanner;

public class alphabetSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows and columns: ");
    int n = sc.nextInt();

    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        System.out.print((char)(j+65)+ " ");
      }
      System.out.println();
    }
  }
}
