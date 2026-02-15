
import java.util.Scanner;

public class FirstOccurance {
  public static void main(String[] args) {
    int[] arr = {1, 1, 1, 1, 2};
    int start =0, end = arr.length -1;

    int idx = -1;

    System.out.println("Enter the target element: ");
    Scanner sc = new Scanner(System.in); 
    int target = sc.nextInt();

    while(start <= end){
      int mid = start + (end - start)/2;

      if(arr[mid] == target){
        idx = mid;
        end = mid - 1;
      } else if(arr[mid] > target){
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    System.out.println("Element "+ target+ " found at index "+idx);
  }
}
