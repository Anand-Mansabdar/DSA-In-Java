
import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {-76, -4, 9, 28, 47, 49, 510, 615, 9911, 99999};
    int start = 0, end = arr.length-1;

    System.out.println("Enter the target element: ");
    Scanner sc = new Scanner(System.in); 
    int target = sc.nextInt();
    while(start <= end){
      int mid = start + (end - start)/2;
      if(arr[mid] == target){
        System.out.println(mid);
        break;
      } else if(arr[mid] > target){
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    sc.close();
  }  
}
