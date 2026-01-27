import java.util.Scanner;

// Method 1
// public class absoluteValue {
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number: ");
//     int num = sc.nextInt();

//     if(num >= 0){
//       System.out.println(num);
//     } else {
//       System.out.println(-1 * num);
//     }
//   }
// }


// Method 2
public class absoluteValue{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt();

    if(num < 0){
      num = -num;
    }
    System.out.println(num);
  }
}