public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = {10, 20, 40, 45, 60, 70, 35};

    System.out.println(elementExists(arr, 0, 35));
  }

  public static boolean elementExists(int[] arr, int idx, int target){
    if(idx == arr.length) return false;
    if(arr[idx] == target) return true;

    return elementExists(arr, idx+1, target);
  }
}
