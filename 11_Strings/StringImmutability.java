public class StringImmutability {
  public static void main(String[] args) {
    String s1 = new String("Anand");
    String s2 = new String("Anand");

    System.out.println(s1.equals(s2));
  }
}
