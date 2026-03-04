public class RowWithMaxSum {
  @SuppressWarnings("")
  public static void main(String[] args) {
    int[][] arr = {{10, 20, 30}, {40, 50, 60}, {10, 10, 10}};
    int sum = 0;
    int row = -1;

    for(int i=0; i<arr.length; i++){
      int rowSum = 0;
      for(int j=0; j<arr[i].length; j++){
        rowSum += arr[i][j];
      }
      if(rowSum > sum){
        sum = rowSum;
        row = i;
      }
    }
    System.out.println(sum);
    System.out.println("The row with max sum is:"+(row+1));
  }
}
