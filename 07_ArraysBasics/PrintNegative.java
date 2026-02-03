public class PrintNegative {
  public static void main(String[] args) {
    int[] arr = {10, -10, -15, 7, -4, 90, -177};

    System.out.println("The negative elements are: ");
    for(int i=0; i<arr.length; i++){
      if(arr[i] < 0){
        System.out.print(arr[i]+ " ");
      }
    }
  }  
}
