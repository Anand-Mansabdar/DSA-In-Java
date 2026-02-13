// Program to Move All the Zeroes to the end of the array

// {1, 2, 0, 4, 3, 0, 5, 0} => {1, 2, 4, 3, 5, 0, 0, 0}

public class MoveZeroesToEnd {
  public static void main(String[] args) {
    int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

    int n = arr.length;

    // Time Complexity - O(n^2)
    // for(int i=0; i<n-1; i++){
    //   for(int j=0; j<n-i-1; j++){
    //     if(arr[j] == 0){
    //       int temp = arr[j];
    //       arr[j] = arr[j+1];
    //       arr[j+1] = temp;
    //     }
    //   }
    // }
    // for(int elem : arr){
    //   System.out.print(elem + " ");
    // }

    // Optimized Approach - O(n)
    int j=0;
    for(int i=0; i<n; i++){
      if(arr[i] != 0){
        if(i != j){
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
        j++;
      }
    }

    for(int elem: arr){
      System.out.print(elem + " ");
    }
  }  
}
