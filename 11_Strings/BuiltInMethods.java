public class BuiltInMethods {
  public static void main(String[] args) {
    String name = "Anand Mansabdar";
    String str = "anand Mansabdar";

    // 1. charAt() - to get a character at an index
    System.out.println(name.charAt(8));

    // 2. length() - returns length of string.
    System.out.println(name.length());

    // 3. indexOf() - returns index of a character (if chars repeat it returns first index)
    System.out.println(name.indexOf("a"));

    // 4. toLowerCase() / toUpperCase()
    System.out.println(name.toLowerCase());
    System.out.println(name.toUpperCase());

    // 5. toCharArray() - converts a string to a char[] array
    System.out.println(name.toCharArray());
    
    // 6. contains() - checks if a character/string is present in a string (returns true/false)
    System.out.println(name.contains("d"));
    System.out.println(name.contains(" /"));

    // 7. lastIndexOf() - returns the last occuring index of a character
    System.out.println(name.lastIndexOf("a"));

    // 8. startsWith() / endsWith() - to check if a string starts/ends with a specific string
    System.out.println(name.startsWith("Ana"));
    System.out.println(name.startsWith("Ananz"));

    // 9. compareTo() - compares two string lexicographically (returns 0 if both are equal, < 0 if str1 comes before str2, > 0 if str1 comes after str2)
    System.out.println(name.compareTo(str));

    // 10. compareToIgnoreCase() - same as above just ignore the case of strings (uppercase / lowercase doesnt matter)
    System.out.println(name.compareToIgnoreCase(str));
  }
}
