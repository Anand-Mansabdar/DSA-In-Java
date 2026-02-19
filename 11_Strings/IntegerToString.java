import java.util.Scanner;

public class IntegerToString {
  @SuppressWarnings("resource")

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(n);
    
    String s = Integer.toString(n);
    System.out.println(s);
  }
}
