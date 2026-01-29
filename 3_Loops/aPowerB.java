import java.util.Scanner;

public class aPowerB {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter value of a: ");
    int a = sc.nextInt();
    System.out.println("Enter value of b: ");
    int b = sc.nextInt();

    int res = 1;

    for(int i=1; i<=b; i++){
      res = res * a;
    }

    System.out.println(res);
  }
}
