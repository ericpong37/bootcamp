import java.util.Scanner;

public class JavaQuest2 {
  /**
   * Expected Output:
   * 
   * Example 1: 
   * Input a month number: 2 
   * Input a year: 2016
   * 
   * February 2016 has 29 days
   * 
   * Example 2: 
   * Input a month number: 12 
   * Input a year: 2014
   * 
   * December 2014 has 31 days
   * 
   * Example 3: 
   * Input a month number: 2 
   * Input a year: 2100
   * 
   * February 2100 has 28 days
   * 
   * Example 4: 
   * Input a month number: 2 
   * Input a year: 2000
   * 
   * February 2000 has 29 days
   */

  // Program the number of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner scanner = new Scanner(System.in);

    int number_Of_DaysInMonth = 0;
    String monthOfName = "Unknown";

    System.out.print("Input a month number: ");
    int month = scanner.nextInt(); // assume 1 - 12

    System.out.print("Input a year: ");
    int year = scanner.nextInt(); // > 0

    switch (month) {
      // code here ...
      case 1: 
        number_Of_DaysInMonth = 31;
        break;
      case 2: 
        if (year % 4 == 0) {
          if (year % 100 == 0) {
            if (year % 400 == 0) {
              
            }
          }
        } else {
          number_Of_DaysInMonth = 28;
        }
        break;
      case 3: 
      case 4: 
        number_Of_DaysInMonth = 30;
        break;
      case 5: 
      case 6: 
      case 7:
      case 8:
      case 9: 
      case 10: 
      case 11: 
      case 12: 

      default:
    }
    // Leap Year: The February has 29 days:
    // 1. Every 4 years (the year is divided by 4)
    // 2. But if the year is divded by 100 and NOT divided by 400 -> Not a leap year.
    // 3. if the year is divided by 400, it is a leap year.
    scanner.close();
    System.out.println(
        monthOfName + " " + year + " has " + number_Of_DaysInMonth + " days");
  }

}