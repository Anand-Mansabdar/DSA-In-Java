
import java.util.Scanner;

public class Calculator {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("Enter an operation between (+, -, *, /, %)");
    String operator = sc.next();

    switch (operator) {
        case "+"->
            System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
        case "-"->
          System.out.println("The difference of "+a+" and "+b+" is "+(a-b));
        case "*"->
          System.out.println("The producr of "+a+" and "+b+" is "+(a*b));
        case "/"->
          System.out.println("The quotient of "+a+" and "+b+" is "+(a/b));
        case "%"->
          System.out.println("The remainder of "+a+" and "+b+" is "+(a%b));
        default->
           System.out.println("Invalid Operator");
    }
  }
}
