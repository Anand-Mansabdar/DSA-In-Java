public class Task6 {
  public static void main(String[] args) {
    int x = 2, y = 3, z = 4;

    x++;
    y = x + y;
    z = y++ + x;
    System.out.println(x+" "+y+" "+z);
  }
}
