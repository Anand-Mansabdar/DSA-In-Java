
import java.util.ArrayList;

public class ReverseArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(20);
    arr.add(18);
    arr.add(45);
    arr.add(33);
    arr.add(1);

    System.out.println(arr);

    int i = 0, j = arr.size()-1;
    while(i < j){
      int temp = arr.get(i);
      arr.set(i, arr.get(j));
      arr.set(j, temp);
      i++;
      j--;
    }

    System.out.println(arr);
  }  
}
