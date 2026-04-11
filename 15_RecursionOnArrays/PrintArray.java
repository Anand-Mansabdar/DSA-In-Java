public class PrintArray {
  public static void main(String[] args) {
    int[] arr = {10, 20, 40, 45, 60, 70, 35};
    printArr(arr, 0);
  }

  public static void printArr(int[] arr, int idx){
    if(idx == arr.length) return;
    System.out.print(arr[idx] + " ");
    printArr(arr, idx+1);
  }
}
