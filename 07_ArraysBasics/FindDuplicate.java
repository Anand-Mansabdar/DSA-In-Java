public class FindDuplicate {
  public static void main(String[] args) {
    int[] arr = {5, 1, 3, 4, 2, 4};
    boolean[] flag = new boolean[arr.length];

    for(int ele : arr){
      if(flag[ele] == true){
        System.out.println(ele+ " is the duplicate element");
        break;
      } else {
        flag[ele] = true;
      }
    }
  }
}
