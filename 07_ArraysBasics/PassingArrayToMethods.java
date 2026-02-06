import java.util.Arrays;

public class PassingArrayToMethods {
  public static void change(int[] x){
    x[3] = 88;
  }
  public static void main(String[] args) {
    int x[] = {10, 2, 76, 69};
    System.out.println(x[3]);
    change(x);
    System.out.println(x[3]);


    // Shallow copy
    int[] arr1 = {1 ,2, 3, 4};
    int[] arr2 = arr1;

    arr2[1] = 10;

    System.out.println(arr1[1]);

    // Deep Copy
    int[] arr3 = Arrays.copyOf(arr1, arr1.length);

    System.out.println(arr3[3]);
    arr3[3] = 100;
    System.out.println(arr3[3]);
    System.out.println(arr1[3]);
  }  
}
