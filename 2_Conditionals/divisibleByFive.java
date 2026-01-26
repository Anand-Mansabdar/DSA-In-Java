
import java.util.Scanner;

public class divisibleByFive {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if(num % 5 == 0){
            System.out.println(+num+ " "+ "is divisible by 5");
        } else {
            System.out.println(+num+ " "+ "is not divisible by 5");
        }
    }
}