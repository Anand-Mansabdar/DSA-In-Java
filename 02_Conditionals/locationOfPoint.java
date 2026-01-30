
import java.util.Scanner;

// Program to check whether a pair of points exists in which quandrant (Q1, Q2, Q3, Q4)

public class locationOfPoint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter first point: ");
    int p1 = sc.nextInt();

    System.out.println("Enter second point: ");
    int p2 = sc.nextInt();

    if(p1 > 0 && p2 > 0){
      System.out.println("Points "+p1+ " & "+p2+" exist in Quadrant1" );
    } else if(p1 < 0 && p2 > 0){
      System.out.println("Points "+p1+ " & "+p2+" exist in Quadrant2" );
    } else if(p1 < 0 && p2 < 0){
      System.out.println("Points "+p1+ " & "+p2+" exist in Quadrant3" );
    } else {
      System.out.println("Points "+p1+ " & "+p2+" exist in Quadrant4" );
    }
  }
}
