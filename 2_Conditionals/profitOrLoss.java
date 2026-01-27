import java.util.Scanner;

public class profitOrLoss {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter selling price: ");
    double sp = sc.nextDouble();
    System.out.println("Enter cost price: ");
    double cp = sc.nextDouble();

    double profit = sp - cp;

    if(profit > 0) System.out.println("Profit"+ ": " + profit);
    else System.out.println("Loss"+ ": " + profit);
  }
}
