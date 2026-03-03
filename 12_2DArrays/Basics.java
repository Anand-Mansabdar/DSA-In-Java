import java.util.Scanner;

public class Basics {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    int[][] mat = new int[3][3];

    System.out.println("Initial 2D matrix: ");
    for(int[] row : mat){
      for(int elem : row){
        System.out.print(elem + " ");
      }
      System.out.println();
    }

    mat[0][0] = 1;
    mat[1][0] = 0;
    mat[2][0] = 0;

    mat[0][1] = 0;
    mat[1][1] = 1;
    mat[2][1] = 0;

    mat[0][2] = 0;
    mat[1][2] = 0;
    mat[2][2] = 1;

    System.out.println("2D Matrix after inserting elements: ");
    for(int[] row : mat){
      for(int elem : row){
        System.out.print(elem + " ");
      }
      System.out.println();
    }

    // Taking inputs in array from the user
    int[][] arr = new int[3][4];
    Scanner sc = new Scanner(System.in);

    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr[i].length; j++){
        System.out.println("Enter element at row: "+i+" and column: "+j);
        arr[i][j] = sc.nextInt();
      }
    }

    // Printing elements
    for(int[] row : arr){
      for(int elem : row){
        System.out.print(elem + " ");
      }
      System.out.println();
    }
  }
  }

