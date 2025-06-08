
// ! "extends Exception" -> InvalidPasswordException become "Checked Exception"

import java.time.LocalDate;
import java.time.LocalDateTime;

public class InvalidPasswordException extends Exception {
  // Parent Class Exception by default contain "message" attribute
  public InvalidPasswordException() {

  }

  public InvalidPasswordException(String message) {
    super(message);
  }

  public static void main(String[] args) {
    // ! During compile time, we have to handle "checked" exception
    // One of the "exception handling": try and catch
    try {
      int result = InvalidPasswordException.isValidPassword("1234$");
      System.out.println(result);
    } catch (InvalidPasswordException e) {
      System.out.println("This is InvalidPasswordException: " + e.getMessage());
    }
  }

  // ! method signature -> throws
  // potentially throw exception -> method caller has to handle the exception.
  public static int isValidPassword(String password)
      throws InvalidPasswordException {
    // length > 8 and contains english characters -> 1
    // Length > 8 and contains numbers and english characters -> 2
    // Length > 8 and contains numbers and english characters and speical char ($#!) -> 3
    // otherwise, throw InvalidPasswordException
    // loop + ascii code
    if (password == null || password != null && password.length() <= 8) {
      throw new InvalidPasswordException("Invalid. Password Length <= 8."); // ! force you to "handle"
    }
    boolean foundNumber = false;
    boolean foundEnglish = false;
    boolean foundSpecialChar = false;
    for (char ch : password.toCharArray()) {
      if (ch >= '0' && ch <= '9') { // 0-9
        foundNumber = true;
      } else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') { // a-z or A-Z
        foundEnglish = true;
      } else if (ch == '#' || ch == '$' || ch == '!') {
        foundSpecialChar = true;
      }
    }
    if (!foundEnglish) {
      throw new InvalidPasswordException(
          "Invalid. English Character is not found.");
    }
    if (foundNumber) {
      if (foundSpecialChar)
        return 3;
      else
        return 2;
    }
    return 1;
  }

}
