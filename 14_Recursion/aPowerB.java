
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
  }

  public static int power(int a, int b){
    if(a == 0) return 0;
    if(a == 1 || b == 0) return 1;

    return a * power(a, b-1);
  }
}
