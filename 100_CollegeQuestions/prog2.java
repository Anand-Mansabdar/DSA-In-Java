import java.util.Scanner;

public class prog2 {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    String binary="";
    while (num>0){
      binary=num%2+binary;
      num=num/2;
    }
    //System.out.println(binary);
    String toggles="";
    for(int i=0;i<binary.length();i++){
      char ch=binary.charAt(i);
        if(ch=='1'){
          toggles=toggles+'0';
        }else{
          toggles=toggles+'1';
        }
    }
    //System.out.println(toggles);
  }
}
