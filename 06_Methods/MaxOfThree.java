public class MaxOfThree {
  public static void maxOfThree(int a, int b, int c){
    if(a > b && a > c) System.out.println(a+" is the greatest");
    else if (b > a && b > c) System.out.println(b+" is the greatest");
    else if (c > a && b < c) System.out.println(c+" is the greatest");
    else System.out.println("All are equal");
  }
  public static void main(String[] args) {
    maxOfThree(20, 20, 20);
  }  
}
