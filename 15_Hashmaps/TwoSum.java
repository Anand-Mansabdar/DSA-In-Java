
import java.util.HashSet;

public class TwoSum {
  public static void main(String[] args) {
    int[] arr = {0, -1, 2, -3, 1};
    int target = -2;
    boolean isPair = false;
    HashSet<Integer> set = new HashSet<>();

    for(int elem : arr){
      int rem = target - elem;

      if(set.contains(rem)){
        isPair = true;
      }
      set.add(elem);
    }
    if(isPair) System.out.println("True");
    else System.out.println("False");
  }
}
