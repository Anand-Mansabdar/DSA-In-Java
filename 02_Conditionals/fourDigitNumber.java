import java.util.Scanner;

public class fourDigitNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int n = sc.nextInt();

    if(n > 999 && n<10000){
      System.out.println(+n+" " + "is a 4 digit number");
    } else {
      System.out.println(+n+" " + "is not a 4 digit number");
    }
  }
}
