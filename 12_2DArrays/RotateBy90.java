// Rotate an array by 90 degrees in clockwise direction

public class RotateBy90 {
  public static void main(String[] args) {
    int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    System.out.println("Original Matrix: ");
    for(int[] row : arr){
      for(int elem : row){
        System.out.print(elem+" ");
      }
      System.out.println();
    }

    int n = arr.length;

    // Transpose the matrix
    for(int i=1; i<n; i++){
      for(int j=0; j<i; j++){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }

    // Reverse the rows
    for(int i=0; i<n; i++){
      int st = 0, end = arr[0].length-1;

      while(st < end){
        int temp = arr[i][st];
        arr[i][st] = arr[i][end];
        arr[i][end] = temp;
        st++;
        end--;
      }
    }

    System.out.println("Matrix after 90 deg clockwise rotation: ");
    // Printing matrix
    for(int[] row : arr){
      for(int elem : row){
        System.out.print(elem+" ");
      }
      System.out.println();
    }
  }
}
