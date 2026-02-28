public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {10, 5, 40, 60, 30, 20, 25};
    int n = arr.length;
    
    for(int e : arr){
      System.out.print(e+" ");
    }
    System.out.println();

    for(int i=0; i<n-1; i++){
      for(int j=0; j<n-i-1; j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    

    for(int e : arr){
       System.out.print(e+" ");
    }
  }
}
