public class DemoString {
  public static void main(String[] args) {
    char c1 = 'H';
    // String is not a primitive
    String s1 = "Hello";
    String s2 = "100";

    // String + operation
    s2 = s2 + "100";
    System.out.println(s2); // 100100
    s1 = s1 + "100";
    System.out.println(s1); // Hello100

    double d1 = 9.5;
    String s3 = d1 + s1;
    System.out.println(s3);

    // String + int
    int x1 = 7;
    String s4 = s1 + x1;
    System.out.println(s4);
  }
}
