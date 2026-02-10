// Program to segregate zeroes and ones in an array. All 0's should be on the LHS and 1's on the RHS

public class SegregateElements {
  public static void main(String[] args) {
    int[] arr = {0, 0, 1, 1, 0};

    int i = 0;
    int j = arr.length - 1;

    while(i < j){
      if(arr[i] == 0){
        i++;
      } else if(arr[j] == 1){
        j--;
      } else {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }

    for(int elem : arr){
      System.out.print(elem + " ");
    }
  }
}
