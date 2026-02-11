
import java.util.ArrayList;
import java.util.Collections;

public class Basics {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(20);
    arr.add(18);
    arr.add(45);
    arr.add(33);
    arr.add(1);

    System.out.println(arr);
    System.out.println(arr.get(0));
    System.out.println(arr.get(3));
    // System.out.println(arr.get(5));  // Error

    // Updating Elements
    arr.set(3, 333);
    System.out.println(arr.get(3));


    // Normal for loop
    for(int i=0; i<arr.size(); i++){
      System.out.print(arr.get(i) + " ");
    }

    System.out.println(); // line break

    // For Each loop
    for(int elem : arr){
      System.out.print(elem + " ");
    }

    System.out.println();

    // Adding element at a specific index
    arr.add(3, 100);
    System.out.println(arr);


    // Removing elements from an ArrayList
    arr.remove(3); // Removing element from a specific index
    System.out.println(arr);


    // Reversing an ArrayList
    Collections.reverse(arr);
    System.out.println(arr);
  }
}
