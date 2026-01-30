
import java.util.Scanner;

// To print whether a given number is prime or not

public class primeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean flag = true;

    System.out.println("Enter a number to check for prime: ");
    int n = sc.nextInt();

    for(int i=2; i * i<= n; i++){
      if(n%i == 0){
        flag = false;
        break;
      }
    }

    if(!flag){
      System.out.println(+n+" is not a prime number.");
    } else {
      System.out.println(+n+" is a prime number.");
    }
  }
}
