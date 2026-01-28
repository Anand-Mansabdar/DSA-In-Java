import java.util.Scanner;

public class ifElseIfLadder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number to check divisibility(5 and 3): ");
    int num = sc.nextInt();

    if(num%5 == 0 && num%3 == 0){
      System.out.println(+num+" is divisible by 5 and 3");
    } else if(num%5 == 0){
      System.out.println(+num+" is divisible by 5 and not 3");
    } else if(num%3 == 0){
      System.out.println(+num+" is divisible by 3 and not 5");
    } else {
      System.out.println(+num+" is not divisible by 5 and 3");
    }
  }
}
