// To check whether an integer is even or odd using ternary operator.

import java.util.Scanner;

public class ternaryOperator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter an integer: ");
    int n = sc.nextInt();

    System.out.println((n % 2 == 0) ? "Even number" : "Odd number");
  }
}
