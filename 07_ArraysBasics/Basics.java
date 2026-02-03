import java.util.Scanner;

public class Basics {
  public static void main(String[] args) {
    // Creating an array
    int[] arr = {6, 1, 2, 44, 9, 15};

    // Indexing of an array
    System.out.println(arr[0]);

    // Changing / Updating elements in an array
    System.out.println(arr[5]); // 15
    arr[5] = 100;
    System.out.println(arr[5]); // 100


    // Creating an empty array
    int[] nums = new int[10]; // Creates an empty array of size 10
    nums[0] = 1;
    nums[1] = 10;
    nums[2] = 2;
    System.out.println(nums[2]); 


    // Iterating through for loop
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+", ");
    }



    // Input and Output of an array (input provided by user)
    Scanner sc = new Scanner(System.in);
    System.out.println("\nEnter the size of an array: ");
    int n = sc.nextInt();
    
    int[] z = new int[n];
    for(int i=0; i<z.length; i++){
      System.out.println("Enter "+i+" element");
      z[i] = sc.nextInt();
    }


    for(int i=0; i<z.length; i++){
      System.out.print(z[i] + " ");
    }
  }
}
