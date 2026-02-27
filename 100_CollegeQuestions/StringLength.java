import java.util.Scanner;

public class StringLength {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int allowdLimit = 50;

    if(s.length() > allowdLimit){
      System.out.println("Caption exceeds the allowed limit");
    } else {
      System.out.println(s);
    }
  }
}