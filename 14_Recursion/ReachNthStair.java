// There are n stairs, a person standing at the bottom wants to reach the top. The person can climb either 1 stair or 2 stairs at a time. Your task is to count the number of ways, the person can reach the top (order does matter).

import java.util.Scanner;

public class ReachNthStair {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number of stairs: ");
    int n = sc.nextInt();
    System.out.println(countWays(n));
  }

  public static int countWays(int n){
    if(n==1) return 1;
    if(n==2) return 2;

    return countWays(n-1) + countWays(n-2);
  }
}
