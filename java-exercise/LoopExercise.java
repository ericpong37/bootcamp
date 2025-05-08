public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    String s = "hello";
    for (int i = 0; i < 6; i++) 
    System.out.println(s);

    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    for (int i = 0; i < s.length(); i++)
    System.out.println(i);

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    for (int i = 2; i < 21; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // 4. Print the numbers between 1 and 100, which can be divided by 3 or 5
    // Use: for loop + if
    for (int i = 0; i < 100; i++) {
      if (i % 3 == 0 || i % 5 == 0)
      System.out.println(i);
    }


    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int sum = 0;
    for (int i = 0; i < 16; i++) {
      if (i < 16) {
        sum += i;
      }
    }
    System.out.println(sum);


    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    int sumOdd = 1;
    int sumEven = 0;
    for (int i = 0; i < 11; i++) {
      if (i % 2 == 1) {
        sumOdd += i;
      } else {
        sumEven += i;
      }
    }
    System.out.println(sumOdd);
    System.out.println(sumEven);
    int product = sumOdd * sumEven;
    System.out.println(product);

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    for (int i = 0; i < str7.length(); i++) {
      if (str7.charAt(i) == 'd') {
        System.out.println("d is found.");
      }
    }


    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";


    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int count = 0;
    for (int i = 0; i < s9.length(); i++) {
      if (s9.charAt(i) == 'p') {
        count++;
      }
    }
    System.out.println("count= " + count);

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for (int i = 0; i < arr10.length; i++) {
      arr10[i] = arr10[i].replace('x', 'k');
      System.out.println(arr10[i]);
    }

    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];

    // 15. Find the max value and min value in arr14
    // Use One Loop + if

    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal

    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";

    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    
  }
}