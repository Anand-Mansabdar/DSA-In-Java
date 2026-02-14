public class SelectionSort {
  public static void print(int[] arr){
    for(int elem : arr){
      System.out.print(elem + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int[] arr = {3, 5, 1, 4, 2, 0};
    int n = arr.length;

    print(arr);

    for(int i=0; i<n-1; i++){
      int min = Integer.MAX_VALUE; // min value
      int idx = -1; // index of min value
      for(int j=i; j<n; j++){
        if(arr[j] < min){
          min = arr[j];
          idx = j;
        }
      }

      // Swapping
      int temp = arr[i];
      arr[i] = arr[idx];
      arr[idx] = temp;
    }
    print(arr);
  }
}
