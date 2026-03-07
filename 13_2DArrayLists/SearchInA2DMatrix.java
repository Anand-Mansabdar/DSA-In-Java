// Search in a Row-Column Sorted Matrix

public class SearchInA2DMatrix {
  public static boolean searchIn2DMatrix(int[][] arr, int target) {
    int m = arr.length, n = arr[0].length;
    int i=0, j=n-1;

    while(i<m && j>=0){
      if(arr[i][j] > target) j--;
      else if(arr[i][j] < target) i++;
      else return true;
    }

    return false;
  }
  public static void main(String[] args) {
    int[][] arr = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};

    int target = 17;
    // int target = 100;

    boolean isFound = searchIn2DMatrix(arr, target);
    System.out.println(isFound);
  }
}
