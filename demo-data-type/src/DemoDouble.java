public class DemoDouble {
  public static void main(String[] args) {
    int x = 9;

    // Store a number with decimal places
    //type: double
    double y = 9.9;
    System.out.println(y); // 9.9

    double p = 99.9;
    int q = 3;
    double amount = p * q;
    System.out.println(amount);

    // 10 -> int value
    // 3 -> int value
    // 1. 10 / 3 -> int / int (10 / 3 -> 3)
    // 2. assign result into w (3 -> 3.0)
    double w = 10 / 3;
    System.out.println(w);

    // ! double / int -> double
    int score1 = 71;
    int score2 = 82; 
    // calculate the average score
    // Step1: (int + int) / int -> int (71 + 82) / 2 -> 76
    // Step2: 76 -> 76.0
    double average = (score1 + score2) / 2.0;
    System.out.println(average);

    // ! divided by zero
    // double r3 = 10 / 0;
    // System.out.println(r3);

    double r4 = 0 / 10;
    System.out.println(r4); // 0.0

  }
}
