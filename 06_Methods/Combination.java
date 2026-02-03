
import java.util.Scanner;

public class Combination {
  public static int factorial(int x){
    int fact = 1;

    for(int i=1; i<=x; i++){
      fact *= i;
    }

    return fact;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of n: "); 
    int n = sc.nextInt();
    System.out.println("Enter the value of r: "); 
    int r = sc.nextInt();

    int nFact = factorial(n);
    int rFact = factorial(r);

    int nrFact = factorial(n-r);

    int nCr = nFact / (rFact * nrFact);

    System.out.println(nCr);
  }  
}
