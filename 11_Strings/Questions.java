
import java.util.Scanner;


public class Questions {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    // Double to string
    Scanner sc = new Scanner(System.in);
    // double n = sc.nextDouble();
    // String s = "" + n;
    // System.out.println(s + " , " +s.length());

    // String to Integer
    String str = "123444";
    int x = Integer.parseInt(str);
    System.out.println(x+10);

    // String to a Character Array
    String s = "Anand Mansabdar";
    char[] chArr = s.toCharArray();
    System.out.println(chArr);

    for(char ch: chArr){
      System.out.print(ch + " ");
    }
  }
}
