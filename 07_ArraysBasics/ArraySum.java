
import java.util.Scanner;

public class ArraySum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter elements of the array: ");
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }

    int sum = 0;
    for(int i=0; i<arr.length; i++){
      sum += arr[i];
    }

    System.out.println("The sum of elements in the array is "+sum);
  }  
}
