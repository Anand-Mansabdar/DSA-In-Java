
import java.util.Scanner;

// Print arithemetic progression from 2,5,8,11....n

public class arithemeticProgression {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter when you want to end your AP: ");
    int n = sc.nextInt();

    for(int i=2; i<n; i=i+3){
      System.out.println(i);
    }
  }
}
