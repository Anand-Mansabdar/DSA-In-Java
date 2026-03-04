public class PrintInSnakePattern {
  public static void main(String[] args) {
    int[][] arr = {{2, 8, 3, 4, 7}, {7, 2, 1, 6, 3}, {5, 5, 4, 1, 4}, {3, 1, 8, 2, 6}};

    // Normal Printing
    System.out.println("Normal Printing");
    for(int[] i : arr){
      for(int j: i){
        System.out.print(j+" ");
      }
      System.out.println();
    }

    System.out.println("Snake Pattern Printing");
    for(int i=0; i<arr.length; i++){
      if(i%2 == 0){
        for(int j=0; j<arr[i].length; j++){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      } else {
        for(int j=arr[i].length-1; j>=0; j--){
          System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
  }
}