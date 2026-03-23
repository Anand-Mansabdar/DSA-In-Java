
import java.util.HashSet;

public class Basics {
  public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();

    set.add(10);
    set.add(50);
    set.add(21);
    set.add(77);
    set.add(45);
    set.add(18);

    System.out.println(set.size());
    System.out.println(set.contains(10));
    System.out.println(set.contains(100));
    set.remove(77);
    System.out.println(set.size());

    System.out.println(set); // No sorted order
  }  
}
