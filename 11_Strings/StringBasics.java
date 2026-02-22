import java.util.Scanner;

public class StringBasics {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    // Creating a char[] array
    char[] arr = {'a', 'n', 'a', 'n', 'd'};

    // Printing elements in array
    for(char elem : arr){
      System.out.print(elem+" ");
    }

    // String creation
    String name = "Anand Mansabdar";
    System.out.println(name);
    System.out.println(name.charAt(6));

    // Taking a string input
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a new string: ");
    String newString = sc.nextLine(); // Prints the complete string
    System.out.println(newString);

    System.out.print("Enter a name: ");
    String inputString = sc.next(); // Prints only the first string - Virat Kohli - prints only Virat 
    System.out.println(inputString);

    // Accessing a character at an index
    System.out.println(inputString.charAt(3));
    // Length of a string
    System.out.println(inputString.length());

    System.out.println(inputString.toLowerCase());
  }
}