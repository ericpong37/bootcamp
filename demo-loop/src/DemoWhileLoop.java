
public class DemoWhileLoop {
  public static void main(String[] args) {
    int x = 2;
    x = x * 2;
    x = x * 2;
    x = x * 2;
    System.out.println(x); // 16

    // For Loop (init, continue condition, modifier)
    // While Loop (continue condition)
    int k = 0;
    while (k < 3) {
      System.out.println("hello"); // 0,1,2
      k++;
    }

    // Do While Loop
    // ! No entry condition (At least execute once)
    k = 0;
    do {
      System.out.println("hello"); // 0,1,2
      k++;
    } while(k < 3);

    

  }
}
