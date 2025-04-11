
public class DemoForLoop {
  public static void main(String[] args) {
    int x = 2;
    x = x * 2;
    x = x * 2;
    x = x * 2;
    System.out.println(x); // 16

    int base = 2;
    int value = 2;
    for (int i = 0; i < 3; i++) {
      value = value * base;
    }
    System.out.println(value);

    // base = ?, + 8 (10 times)

    int num1 = 9;
    int num2 = 17;
    int max = -1;
    if (num1 > num2) {
      max = num1;
    } else {
      max = num2;
    }
    System.out.println(max);

    // 0 - 100, Find the largest odd number, which is < 90
    // for
    int maxOdd = -1;
    for (int i = 0; i < 101; i++) {
      if (i % 2 == 1 && i < 90 && i > maxOdd) {
        maxOdd = i;
      }
    }
    System.out.println(maxOdd); // 89

    // 0 - 20, sum up all even numbers
    // 0 + 2 + 4...+ 20
    int sum = 0;
    for (int i = 0; i < 21; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);

    // 0 - 30, if < 20, sum up odd numbers, if >= 20, sum up even numbers
    // result
    int box = 0;
    for (int i = 0; i < 31; i++) {
      if (i < 20) {
        if (i % 2 == 1) {
          box += i;
        }
      } else {
        if (i % 2 == 0) {
          box += i;
        }
      }
    }
    System.out.println(box); // 250

    // Searching
    String s1 = "welcome to bootcamp.";
    // 1. Find the number of 'o'
    // for + charAt()
    int count = 0;
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) == 'o') {
        count++;
      }
    }
    System.out.println(count);

    // ! for + continue
    // Approach 1: simple if
    for (int i = 0; i < 3; i++) {
      if (i % 2 == 0) {
        System.out.println(i); // 0,2
      }
    }
    // Approach 2: continue
    for (int i = 0; i < 3; i++) {
      if (i % 2 == 1) {
        continue; // skip the rest of code, goes to i++
      }
      System.out.println(i); // 0,2
    }

    // ! for + break
    // Approach 1: simple if
    for (int i = 0; i < 3; i++) {
      if (i < 2) {
        System.out.println(i); // 0,1
      }
    }
    // Approach 2: break
    for (int i = 0; i < 3; i++) {
      if (i >= 2) {
        break; // skip the rest of code, goes to i++
      }
      System.out.println(i); // 0,1
    }


  }
}
