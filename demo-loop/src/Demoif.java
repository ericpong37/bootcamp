public class DemoIf {
  public static void main(String[] args) {
    // if, else if, else
    int x = 9;

    // 1. if + else if + else
    if (x < 10) {
      System.out.println("x < 10"); // ! print
    } else if (x < 15) {
      System.out.println("x < 15"); // not print
    } else if (x >= 20) {
      System.out.println("x >= 20"); // not print
    } else { // 10 - 19
      System.out.println("10 - 19"); // not print
    }

    // 2. if

    // 3. if + else

    // 4. if + else if
    String s = "goodbye";
    if (s.equals("hello")) {
      System.out.println("this is hello");
    } else if (s.equals("Hello")) {
      System.out.println("this is Hello");
    }

    boolean isFemale = true;
    boolean isSmoker = true;
    int age = 80;

    // base premium = 120

    // Female 40 or above, premium 8% more
    // Male 16 or above, premium 3% more
    // Smoker -> 7% more
    // Age 70 or above -> 20% more

    // 1. Female 40 NS -> 8
    // 2. Female 40 S -> 8 + 7
    // 3. Male 16 NS -> 3
    // 4. Male 16 S -> 3 + 7
    // 5. Male 15 NS -> 0
    // 6. Male 15 S -> 7

    double premium = 120.0;
    double extraRate = 0.0;
    if (isFemale) {
      if (age >= 70) {
        extraRate += 0.2;
      } else if (age >= 40) {
        extraRate += 0.08;
      }
    } else { // male
      if (age >= 70) {
        extraRate += 0.2;
      } else if (age >= 16) {
        extraRate += 0.03;
      }
    }
    if (isSmoker) {
      extraRate += 0.07;
    }
    premium *= 1 + extraRate;
    System.out.println(extraRate); // 0.27
    System.out.println(premium); // 152.4


  }
}