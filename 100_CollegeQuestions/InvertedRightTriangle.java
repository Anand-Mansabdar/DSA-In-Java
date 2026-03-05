public class InvertedRightTriangle {
  public static void main(String[] args) {
    int n = 7;

    for(int i=0; i<n; i++){
      for(int j=1; j<=i; j++){
        System.out.print("_"+" ");
      }

      for(int j=n-i; j>0; j--){
        System.out.print("*"+" ");
      }

      System.out.println();
    }
  }
}
