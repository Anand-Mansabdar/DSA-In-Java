public class BuiltInMathFunctions {
  public static void main(String[] args) {
    System.out.println(Math.sqrt(64));  // Square root
    System.out.println(Math.cbrt(27));  // Sube root
    System.out.println(Math.abs(-4.5));   // Sbsolute value - Mod of a number
    System.out.println(Math.max(9.76, 9.99)); // Max function
    System.out.println(Math.min(-7.88, -7.87));    // Min function
    System.out.println(Math.floor(-7.8));  // Greatest Integer Function
    System.out.println(Math.ceil(6.745));

    System.out.println(Math.pow(5, 3)); // Exponential function - cannot be done using -ve numbers (NaN)
    System.out.println(Math.pow(0, 0));
  } 
}
