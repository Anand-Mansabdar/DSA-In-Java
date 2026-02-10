

public class SecondLargestElement {
  public static void main(String[] args) {
    int[] arr = {40, 30, 60, 45, 90, 10, 60};
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;

    for(int i=0; i<arr.length; i++){
      if(arr[i] > largest){
        largest = arr[i];
      }
    }

    for(int i=0; i<arr.length; i++){
        if(arr[i] > secondLargest && arr[i] != largest) secondLargest = arr[i];
    }

    System.out.println(largest);
    System.out.println(secondLargest);
  }
}
