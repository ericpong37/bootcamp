
public class Ball {
  // attributes
  private double size;

  // constructor
  // ! by default, implicitly empty constructor exists
  // ! but once you define a new constructor, the empty constructor will disappear
  public Ball() {
    // this.size = 3;
  }

  // Can be more than one constructor
  // ! All arguements constructor
  public Ball(double size) {
    this.size = size;
  }

  // methods
  // setter
  public void setSize(double size) {
    this.size = size;
  }

  // getter
  public double getSize() {
    return this.size;
  }

  public String getSizeDesc() {
    if (this.size > 5) {
      return "BIG";
    } else {
      return "SMALL";
    }
  }

  // main (create object, set, get)
  public static void main(String[] args) {
    // "new" associate with constructor
    Ball b1 = new Ball(); // call empty constructor
    b1.setSize(4);
    System.out.println(b1.getSizeDesc());

    Ball b2 = new Ball(10); // call the another constructor
    System.out.println(b2.getSize()); // 10.0
  }
}

  // main (create object, set, get)
  public static void main(String[] args) {
    Ball b1 = new Ball();
    b1.setSize(4);
    System.out.println(b1.getSizeDesc());
  }
}