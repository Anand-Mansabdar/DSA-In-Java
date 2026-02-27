public class PasswordChecker {
  public static void main(String[] args) {
    String password = "Anand12@#";

    boolean hasUpper = false;
    boolean hasLower = false;
    boolean hasDigit = false;
    boolean hasSpecial = false;

    char[] passArr = password.toCharArray();

    for(char ch : passArr){
      if(Character.isUpperCase(ch)){
        hasUpper = true;
      } else if(Character.isLowerCase(ch)){
        hasLower = true;
      } else if(Character.isDigit(ch)){
        hasDigit = true;
      } else {
        hasSpecial = true;
      }
    }

    if(hasUpper && hasLower && hasDigit && hasSpecial){
      System.out.println("Strong Password");
    } else {
      System.out.println("Weak Password");
    }
    
  }
}
