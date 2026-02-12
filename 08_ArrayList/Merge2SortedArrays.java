public class Merge2SortedArrays {
  public static void main(String[] args) {
    int[] arr1 = {2, 5, 6, 9};
    int[] arr2 = {1, 3, 4, 5, 10, 11};

    int[] res = new int[arr1.length + arr2.length];

    int i = 0, j=0, k=0;

    while(i < arr1.length && j < arr2.length){
      if(arr1[i] < arr2[j]){
        res[k] = arr1[i];
        k++;
        i++;
      } else {
        res[k] = arr2[j];
        k++;
        j++;
      }
    }

    while(i < arr1.length){
      res[k] = arr1[i];
      k++;
      i++;
    }

    while(j < arr2.length){
      res[k] = arr2[j];
      k++;
      j++;
    }

    for(int elem: res){
      System.out.print(elem + " ");
    }
  }
}
