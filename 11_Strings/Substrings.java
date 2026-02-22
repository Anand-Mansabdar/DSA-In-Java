public class Substrings {
  public static void main(String[] args) {
    String name = "Anand Mansabdar";
    System.out.println(name);

    // name.charAt(0) = "B"; // Not possible (Strings are immutable - Individual characters cannot be changes)

    name = "Virat Kohli";
    System.out.println(name);

    // substring with only beginIndex - prints all the characters from the index
    System.out.println(name.substring(6));

    // substring with start and end index - prints string from start index to the end index
    System.out.println(name.substring(3, 7));
  }
}
