
import java.util.Scanner;

// Print a table by taking input from the user

public class printTable {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number to print a table: ");
    int num = sc.nextInt();
    System.out.println("\n");

    for(int i=1; i<=10; i++){
      System.out.println(+num+"x"+i+" = "+ num * i);
    }
  }  
}
