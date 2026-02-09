// Task :- To multiply odd indexed elements with 2 and add 10 to even indexed elements

public class ArrayQuestion1 {
  public static void main(String[] args) {
    int[] arr = {30, 50, 40, 10, 15, 35, 65, 90, 20};

    for(int i=0; i<arr.length; i++){
      if(i%2 == 0){
        arr[i] = arr[i] + 10;
      } else {
        arr[i] = arr[i] * 2;
      }

      System.out.print(arr[i] + " ");
    }
  }
}
