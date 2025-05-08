public class DemoOperator {
  public static void main(String[] args) {
    int x = 3;
    x++;
    System.out.println(x);
    ++x;
    System.out.println(x);

    x = ++x +1;
    System.out.println(x);

    x = x++ + 1;
    System.out.println(x);

    int y = 2;
    x = ++y + 1;
    
  }
}
