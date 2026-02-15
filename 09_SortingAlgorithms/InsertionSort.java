public class InsertionSort {
  public static void main(String[] args) {
    int[] arr = {3, 5, 1, 4, 2, 0};
    int n = arr.length;
    for(int ele : arr){
      System.out.print(ele + " ");
    }

    System.out.println();

    for(int i=1; i<n; i++){
      int j=i;
      while(j > 0 && arr[j] < arr[j-1]){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;
      }
    }

    for(int ele : arr){
      System.out.print(ele + " ");
    }
  } 
}
