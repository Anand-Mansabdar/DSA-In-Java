
import java.util.ArrayList;

public class Basics {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> mat = new ArrayList<>();

    // Adding elements into a 2D array list
    ArrayList<Integer> a = new ArrayList<>();
    a.add(10); a.add(20); a.add(30);

    ArrayList<Integer> b = new ArrayList<>();
    b.add(40); b.add(50); b.add(60); b.add(101);

    ArrayList<Integer> c = new ArrayList<>();
    c.add(70); c.add(80); c.add(90); c.add(100); c.add(1);

    mat.add(a);
    mat.add(b);
    mat.add(c);

    System.out.println(mat);

    // Printing
    System.out.println("Printing a 2D array list using for loop");
    for(int i=0; i<mat.size(); i++){
      for(int j=0; j<mat.get(i).size(); j++){
        System.out.print(mat.get(i).get(j)+" ");
      }
      System.out.println();
    }

    System.out.println();

    // Printing using for-each loop
    System.out.println("Printing a 2D array list using for-each loop");
    for(ArrayList<Integer> list : mat){
      for(int elem : list){
        System.out.print(elem + " ");
      }
      System.out.println();
    }

    // Adding en empty array list 
    mat.add(new ArrayList<>());
    System.out.println(mat);
  }  
}
