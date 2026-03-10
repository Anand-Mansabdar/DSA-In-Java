public class MatrixMultiplication{
  public static void main(String[] args) {
    int[][] mat1 = {{1, 2}, {3, 4}};
    int[][] mat2 = {{4, 3}, {2, 1}};

    int n = mat1.length;
    int[][] res = new int[n][n];

    for(int i=0; i<n; i++){
      for(int j=0; j<n; j++){
        for(int k=0; k<n; k++){
          res[i][j] += mat1[i][k] * mat2[k][j];
        }
      }
    }

    for(int[] row : res){
      for(int elem : row){
        System.out.print(elem + " ");
      }
      System.out.println();
    }
  }
}