// To print a diamond star pattern

//       * 
//     * * * 
//   * * * * * 
// * * * * * * *  (for n=4)
//   * * * * * 
//     * * * 
//       * 

import java.util.Scanner;

public class StarDiamond {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();
    int nsp = n-1;
    int nst = 1;

    for(int i=1; i<=n; i++){
      for(int j=1; j<=nsp; j++){
        System.out.print("  ");
      }

      for(int j=1; j<=nst; j++){
        System.out.print("* ");
      }
      nst+=2;
      nsp--;
      System.out.println();
    }

    nsp = 1;
    nst = 2*n-3;

    for(int i=1; i<=n-1; i++){
      for(int j=1; j<=nsp; j++){
        System.out.print("  ");
      }

      for(int j=1; j<=nst; j++){
        System.out.print("* ");
      }

      nst-=2;
      nsp++;
      System.out.println();
    }
  }
}
