
import java.util.Scanner;

public class RotateArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("How many times do you want to rotate the array: ");

    int d = sc.nextInt();
    int n = arr.length;

    d = d % n;
    reverse(arr, 0, d-1);
    reverse(arr, d, n-1);
    reverse(arr, 0, n-1);

    for(int elem : arr){
    System.out.print(elem + " ");
    }
  }

  public static void reverse(int[] arr, int i, int j) {
    while(i < j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] =temp;
      i++;
      j--;
    }
  }
}
