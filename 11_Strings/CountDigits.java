
import java.util.Scanner;

public class CountDigits {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    String str = "" + n;
    System.out.println(str.length());
  }
}
