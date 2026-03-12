public class HCF {
  public static void main(String[] args) {
    int a = 16;
    int b = 24;

    System.out.println(hcf(a, b));
  }

  public static int hcf(int a, int b){
    if(a==0) return b;

    return hcf(b%a, a);
  }
}
