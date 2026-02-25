
import java.util.Arrays;


public class Anagram {
  public static boolean isAnagram(String s1, String s2){
    if(s1.length() != s2.length()) return false;

    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    Arrays.sort(c1);
    Arrays.sort(c2);

    int i=0, j=0;
    while(i<c1.length && j<c2.length){
      if(c1[i] != c2[j]) return false;
      i++;
      j++;
    }
    return true;
  }
  public static void main(String[] args) {
    String s1 = "race";
    String s2 = "cared";

    System.out.println(isAnagram(s1, s2));
  }
}
