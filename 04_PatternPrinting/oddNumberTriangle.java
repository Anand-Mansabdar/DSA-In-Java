// To print the following pattern

// 1 
// 1 3
// 1 3 5
// 1 3 5 7  (for n=4)

import java.util.Scanner;

// public class oddNumberTriangle {
//   public static void main(String[] args) {
    
//     Scanner sc = new Scanner(System.in);

//     System.out.println("Enter the number of rows: ");
//     int n = sc.nextInt();
//     int x = 1;

//     for(int i=1; i<=n; i++){
//       for(int j=1; j<=i; j++){
//         System.out.print(x+ " ");
//         x += 2;
//       }
//       x=1;
//       System.out.println();
//     }
//   }
// }



// Method 2 - without using an extra variable
public class oddNumberTriangle {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        System.out.print((j*2 - 1)+ " ");
      }
      System.out.println();
    }
  }
}
