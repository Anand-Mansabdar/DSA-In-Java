
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicates {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter the size of the array: ");
     int n = sc.nextInt();
     int[] arr = new int[n];

     for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
     }

    //  for(int i=0; i<n; i++){
    //   Boolean isDuplicate = false;
    //   for(int j=1; j<i; j++){
    //     if(arr[j] == arr[i]){
    //       isDuplicate= true;
    //       break;
    //     }
    //   }

    //   if(!isDuplicate){
    //     System.out.print(arr[i] + " ");
    //   }
    //  }


    Set<Integer> s = new HashSet<>();
    for(int elem : arr){
      s.add(elem);
    }

    System.out.println(s);
  }
}
