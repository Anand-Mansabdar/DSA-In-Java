import java.util.ArrayList;

public class StringBuilders {
  public static void print(ArrayList<Character> str){
    for(char elem: str){
      System.out.print(elem+" ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    // Creating an array of characters
    ArrayList<Character> str = new ArrayList<>();

    str.add('a');
    str.add('b');
    print(str);
    str.add(0, 'x');
    print(str);

    // Creating strings using StringBuilder
    StringBuilder st = new StringBuilder();
    System.out.println(st.capacity()); // Capacity of an empty string builder is 16

    StringBuilder s = new StringBuilder("Anand");
    System.out.println(s.length()+" "+s.capacity());
    System.out.println(s);
    s.append(" Mansabdar");
    System.out.println(s);
    System.out.println(s.capacity());
    s.setCharAt(0, 'a');
    System.out.println(s);
    
    String name = s.toString();
    // String name = s; // Error
    System.out.println(name);
    
    s.append("hucbwuqybvwiecnjiac.jndhcsdbvuiweviqwvqw");
    System.out.println(s.length()+" "+s.capacity());
    s.append("a");
    System.out.println(s.length()+" "+s.capacity());

    System.out.println(s.reverse());

    System.out.println(s);
    s.deleteCharAt(10);
    System.out.println(s);
    s.delete(4, 7);
    System.out.println(s);
  }
}
