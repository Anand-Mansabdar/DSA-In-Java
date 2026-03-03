import java.util.Arrays;

public class MostFrequentCharacter {
  public static char freqCharacter(String s){
    s = s.toLowerCase();
    int n = s.length();
    int maxFreq = 0;

    char maxChar = s.charAt(0);

    for(int i=0; i<n; i++){
      int freq = 1;
      char ch = s.charAt(i);
      for(int j=i+1; j<n; j++){
        if(s.charAt(j) == ch) freq++;
      }

      if(freq > maxFreq){
        maxFreq = freq;
        maxChar = ch;
      } else if(freq == maxFreq && ch < maxChar){
        maxChar =ch;
      }
    }
    System.out.println(maxFreq);
    return maxChar;
  }

  public static char optimizedApproach(String s){
    s=s.toLowerCase();
    char[] arr = s.toCharArray();
    int n = s.length();
    int maxFreq = 0;
    char ans = s.charAt(0);
    Arrays.sort(arr);

    int i=0, j=0;
    while(j<n){
      if(arr[i] == arr[j]) j++;
      else {
        int freq = j-i;
        if(freq > maxFreq){
          maxFreq=freq;
          ans = arr[i];
        }
        i=j;
      }
    }
    int freq = j-i;
    if(freq > maxFreq){
      maxFreq=freq;
      ans = arr[i];
    }
    System.out.println(maxFreq);
    return ans;
  }

  public static char bestApproach(String s){
    s = s.toLowerCase();
    int n = s.length();
    int[] freq = new int[26];

    for(int i=0; i<n; i++){
      char ch = s.charAt(i);
      int idx = ch-'a';
      freq[idx]++;
    }
    int maxFreq = 0;
    char ans = s.charAt(0);
    for(int i=0; i<26; i++){
      if(freq[i] > maxFreq){
        maxFreq=freq[i];
        ans = (char)(i+97);
      }
    }
    System.out.println(maxFreq);
    return ans;
  }

  public static void main(String[] args) {
    String s = "AnandMansabdar";
    System.out.println(freqCharacter(s));

    System.out.println(optimizedApproach(s));

    System.out.println(bestApproach(s));
  }
}
