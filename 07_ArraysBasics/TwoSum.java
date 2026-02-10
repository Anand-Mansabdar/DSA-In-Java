
import java.util.Scanner;

public class TwoSum {
  public static void main(String[] args) {
    int[] arr = {1, 5, 8, -3};

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a target element: ");
    int n = sc.nextInt();
    boolean flag = false;

    for(int i=0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){
        if(arr[j] + arr[i] == n){
          flag = true;
          break;
        }
      }
    }

    if(!flag) System.out.println("False");
    else System.out.println("True");
  }
}
