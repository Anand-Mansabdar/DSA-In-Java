public class PalindromeString {
  public static void main(String[] args) {
    String name = "markram";
    String rev = "";

    for(int i=name.length()-1; i>=0; i--){
      rev += name.charAt(i);
    }

    if(rev.equals(name)){
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a palindrome");
    }
  }
}
