public class ReverseRows {
  @SuppressWarnings("")
  public static void main(String[] args) {
    int[][] arr = {{2, 8, 3, 4, 7}, {7, 2, 1, 6, 3}, {5, 5, 4, 1, 4}, {3, 1, 8, 2, 6}};

    for(int i=0; i<arr.length; i++){
      int st = 0, end = arr[i].length-1;
      
      while(st < end){
        int temp = arr[i][st];
        arr[i][st] = arr[i][end];
        arr[i][end] = temp;

        st++;
        end--;
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

// TODO :- reverse the columns of the 2D matrix
