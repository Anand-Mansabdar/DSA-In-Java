public class SumOfSubstrings {
  public static void main(String[] args) {
    String s = "6759";
    int sum = 0;

    for(int i=0; i<s.length(); i++){
      for(int j=i+1; j<=s.length(); j++){
        int n = Integer.parseInt(s.substring(i, j));
        sum+=n;
      }
    }
    System.out.println(sum);
  }
}
