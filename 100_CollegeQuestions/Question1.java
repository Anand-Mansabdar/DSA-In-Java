import java.util.Scanner;

public class Question1{
  @SuppressWarnings("resource")
  public static void main(String[] abc){
    Scanner atharva = new Scanner(System.in);
    System.out.println("Enter an amount: ");
    int balance = 1500;
    int userAmount = atharva.nextInt();
    if(userAmount>0){
      balance = balance + userAmount;
    } else  {
      balance = balance + userAmount;
    }
    System.out.println(balance);

  }
}