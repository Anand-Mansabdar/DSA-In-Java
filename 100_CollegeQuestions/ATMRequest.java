
import java.util.Scanner;

public class ATMRequest {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int balance = 10000;

    int withdrawAmt = sc.nextInt();

    if(withdrawAmt < balance && withdrawAmt%5 == 0){
      balance = balance - withdrawAmt;
      System.out.println("Withdraw Successful! Remaining balance is "+balance);
    } else {
      System.out.println("Invalid denomination. Enter multiples of 5");
      System.out.println("Withdraw unsuccessful! Remaining balance is "+balance);
    }
  }
}