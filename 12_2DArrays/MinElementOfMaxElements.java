// Program to find the minimum element out of all the maximum elements of each row

public class MinElementOfMaxElements {
  @SuppressWarnings("")
  public static void main(String[] args) {
    int[][] arr = {{2, 8, 3, 4}, {7, 2, 1, 6}, {5, 5, 4, 1}, {3, 1, 8, 2}};
    int min = Integer.MAX_VALUE;

    for(int i=0; i<arr.length; i++){
      int maxElement = Integer.MIN_VALUE;
      for(int j=0; j<arr[i].length; j++){
        if(arr[i][j] >= maxElement){
          maxElement = arr[i][j];
        }
      }

      if(maxElement < min){
        min = maxElement;
      }
    }
    System.out.println("The minimum element of all the max elements of each row is "+min);
  }
}
