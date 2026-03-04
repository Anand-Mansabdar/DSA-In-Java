// Transpose a rectangular matrix using an extra space(array)

public class TransposeRectangle {
  public static void main(String[] args) {
    int[][] arr = {{2, 8, 3, 4, 7}, {7, 2, 1, 6, 3}, {5, 5, 4, 1, 4}, {3, 1, 8, 2, 6}};

    int row = arr.length, col = arr[0].length;
    int[][] res = new int[col][row];

    for(int i=0; i<res.length; i++){
      for(int j=0; j<res[i].length; j++){
        res[i][j] = arr[j][i];
      }
    }
    
    for(int[] r : res){
      for(int elem : r){
        System.out.print(elem+" ");
      }
      System.out.println();
    }
  }
}
