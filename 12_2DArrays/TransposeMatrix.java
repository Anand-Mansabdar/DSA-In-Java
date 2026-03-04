// Transpose a Square Matrix

public class TransposeMatrix {
  public static void main(String[] args) {
    // int[][] arr = {{2, 8, 3, 4, 7}, {7, 2, 1, 6, 3}, {5, 5, 4, 1, 4}, {3, 1, 8, 2, 6}};

    int[][] arr = {{1, 6, 8}, {4, 2, 7}, {2, 4, 6}};

    // Transpose Logic
    for(int i=1; i<arr.length; i++){
      for(int j=0; j<i; j++){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
      }
    }

    for(int[] row : arr){
      for(int elem : row){
        System.out.print(elem+" ");
      }
      System.out.println();
    }
  }
}
