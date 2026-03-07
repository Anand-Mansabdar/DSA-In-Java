
import java.util.ArrayList;

public class SpiralTraversing {
  public static void spiralTraverse(int[][] arr){
    ArrayList<Integer> ans = new ArrayList<>();
    int m = arr.length;
    int n = arr[0].length;

    int firstRow = 0, lastRow = m-1;
    int firstCol = 0, lastCol = n-1;

    while(firstRow <= lastRow && firstCol <= lastCol){
      // Traverse from left->right
      for(int j=firstCol; j<=lastCol; j++){
        ans.add(arr[firstRow][j]);
      }
      firstRow++;
      if(firstRow > lastRow || firstCol > lastCol) break;

      // Traverse from up->down
      for(int i=firstRow; i<=lastRow; i++){
        ans.add(arr[i][lastCol]);
      }
      lastCol--;
      if(firstRow > lastRow || firstCol > lastCol) break;

      // Traverse from right->left
      for(int j=lastCol; j>=firstCol; j--){
        ans.add(arr[lastRow][j]);
      }
      lastRow--;
      if(firstRow > lastRow || firstCol > lastCol) break;

      // Traverse from bottom -> up
      for(int i=lastRow; i>=firstRow; i--){
        ans.add(arr[i][firstCol]);
      }
      firstCol++;
    }
    
    // Printing array
    for(int elem : ans){
      System.out.print(elem + " ");
    }
  }
  public static void main(String[] args) {
    int[][] arr = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};

    spiralTraverse(arr);
  }
}
