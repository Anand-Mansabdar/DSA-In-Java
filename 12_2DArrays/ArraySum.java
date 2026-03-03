public class ArraySum {
  public static void main(String[] args) {
    int[][] arr = {{10, 20, 30}, {40, 50, 60}, {10, 10, 10}};

    int sum = 0;

    for(int[] row : arr){
      for(int elem: row){
        sum += elem;
      }
    }

    System.out.println("Sum: "+sum);
  }
}
