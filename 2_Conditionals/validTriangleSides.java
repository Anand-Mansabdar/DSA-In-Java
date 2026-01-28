
import java.util.Scanner;

public class validTriangleSides {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first side of the triangle: ");
    int a = sc.nextInt();
    System.out.println("Enter second side of the triangle: ");
    int b = sc.nextInt();
    System.out.println("Enter third side of the triangle: ");
    int c = sc.nextInt();

    if(a+b >= c && b+c >= a && c+a >= b){
      System.out.println(+a+","+b+","+c+" are valid sides of the triangle");
    } else {
      System.out.println(+a+","+b+","+c+" are not valid sides of the triangle");
    }
  }
}
