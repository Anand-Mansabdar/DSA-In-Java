// To print the following 
// 5 4 3 2 1 1 2 3 4 5 (for n=5)
import java.util.Scanner;

public class PrintIncreasingDecreasing {
  public static void print(int n){
    if(n==0) return;
    
    System.out.print(n+" ");
    print(n-1);
    System.out.print(n+" ");
  }
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    print(n);
  }  
}
