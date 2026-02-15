public class PeakIndexInMountainArray {
  public static int peakIndex(int[] arr){
    int n = arr.length;
    int start = 1, end = n-2;

    if(n==1) System.out.println();

    while(start <= end){
      int mid = start + (end - start)/2;

      if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
        return mid;
      } else if(arr[mid] > arr[mid+1] && arr[mid] < arr[mid-1]){
        end = mid-1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    // int[] arr = {1, 2, 4, 5, 7, 8, 3};
    int[] arr = {10, 20, 15, 2, 23, 90, 80};
    System.out.println("Peak element is present at index: "+peakIndex(arr));
  }  
}
