// To print the following pattern - Alphabet Square 2 (variation)

// A A A A 
// B B B B 
// C C C C 
// D D D D

import java.util.Scanner;

public class alphabetSquare2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows and columns: ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n; j++){
        System.out.print((char)(i+64)+" ");
      }
      System.out.println();
    }
  }
}
