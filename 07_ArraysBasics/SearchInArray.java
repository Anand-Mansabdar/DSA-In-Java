// To search for an element in an array.

import java.util.Scanner;

public class SearchInArray {
  public static void main(String[] args) {
    int[] arr = {30, 50, 40, 10, 15, 35, 65, 90, 20};

    System.out.println("Enter a number to search: ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=0; i<arr.length; i++){
      if(arr[i] == n){
        System.out.println("The given number "+n+" is found at index "+i);
      }
    }
  }
}
