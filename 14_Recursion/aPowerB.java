
import java.util.Scanner;

public class aPowerB {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter base number: ");
    int a = sc.nextInt();

    System.out.println("Enter the exponent: ");
    int b = sc.nextInt();

    System.out.println(power(a, b));
    System.out.println(optimized(a, b));
  }

  // Higher time complexity O(b)
  public static int power(int a, int b){
    if(a == 0) return 0;
    if(a == 1 || b == 0) return 1;

    return a * power(a, b-1);
  }

  // Optimized Time Complexity O(logn)
  public static int optimized(int a, int b){
    if(b == 0) return 1;
    int call = optimized(a, b/2);

    if(b%2 != 0){
      return a*call * call;
    } else {
      return call * call;
    }
  }
}
