// To print the following pattern - Vertically Flipped Star Triangle

//       * 
//     * * 
//   * * * 
// * * * * (for n=4)
import java.util.Scanner;

// Method 1 - Using 2 loops (one outer and one inner loop)
// public class VerticallyFlippedTriangle {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the number of rows: ");
//     int n = sc.nextInt();

//     for(int i=1; i<=n; i++){
//       for(int j=1; j<=n; j++){
//         if(i+j <= n){
//           System.out.print("  ");
//         } else {
//           System.out.print("* ");
//         }
//       }
//       System.out.println();
//     }
//   }
// }


// Method 2 - Using 3 loops(one outer loop and two inner loops)
public class VerticallyFlippedTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){ // Loop to print spaces
        System.out.print("  ");
      }

      for(int j=1; j<=i; j++){ // Loop to print stars
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}