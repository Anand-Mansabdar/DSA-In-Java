// Program to create a Geometric Progression

import java.util.Scanner;

public class geometricProgression {
  public static void main(String[] args) {
    int a =1, r=2;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of terms in GP: ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++){
      System.out.println(a);
      a = a*r;
    }
  }
}