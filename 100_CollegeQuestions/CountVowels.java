public class CountVowels {
  public static void main(String[] args) {
    String s = "atharva";
    
    int count = 0;
    
    // for(int i=0; i<s.length(); i++){
    //   char c = s.compareToIgnoreCase(s.charAt(i));
    //   if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
    //     System.out.println(c);
    //   }
    // }
    // System.out.println(count);

    String newStr = s.toLowerCase();

    char[] ch = newStr.toCharArray();
    for(char c : ch){
      if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
        count++;
        System.out.println(c);
      }
    }
    System.out.println(count);
  }
}
