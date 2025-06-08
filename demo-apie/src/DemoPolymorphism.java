public class DemoPolymorphism {
  public static void main(String[] args) {
    // I -> Inheritence (extends)
    // A -> Abstraction (implements)
    // P -> Polymorphism (Parent Class / Interface)
    // E -> Encapsulation (Getter/Setter for private variable)

    // 1. Parent Class
    Animal a1 = new Dog("Peter");
    // Dog d1 = a1; // why error? type unsafe

    // ! Java compile time: Method readability based on the type of "object reference"
    // a1.bark();
    System.out.println(a1.getName()); // Animal.class has getName(), ensures Cat/Dog must contain getName()

    // ! Compile-time: Animal has sound(), ensures Cat/Dog has sound() method
    // ! Run-time: Found the object is Dog, so the result "wow wow"
    a1.sound(); // wow wow ...

    // ! how to elimate the risk? we can use instanceof to check the actual type of object
    if (a1 instanceof Dog) {
      Dog d1 = (Dog) a1; // force converison (downcast) - risky
      d1.bark();
    } else if (a1 instanceof Cat) {
      Cat c1 = (Cat) a1; // force converison (downcast) - risky
    }

    // 2. Interface
    Flyable superman = new Superman("John");
    superman.fly(); // OK, I am flying ...
    // superman.drink(); // NOT OK
    // superman.eat(); // NOT OK
    // superman.sleep(); // NOT OK


    // Example (Account)
    // Use Polymorphism to create objects
    Account acc1 = new PersonalAccount();
    Account acc2 = new CommericalAccount();

    // Parent Class (Account)
    acc1.getSavingAccount().credit(300.0);
    System.out.println(acc1.getSavingAccount().getBalance());
    acc2.getSavingAccount().credit(400.0);
    System.out.println(acc2.getSavingAccount().getBalance());

    SubAccount subAcc1 = SavingAccount.ofHKD();
    SubAccount subAcc2 = new CurrentAccount();
    subAcc1.credit(900.0);
    subAcc2.credit(100.0);

    // Example (Shape)
    // Polymorphism
    int x = 100;
    Shape shape;
    if (x > 50) {
      shape = new Circle(3.5, "WHITE");
    // } else if () { // ! A new Shape comes ...
    } else {
      shape = new Rectangular("BLUE", 4.5, 7.8);
    }

    // ! area() is a common method for Circle and Rectangular
    double area = shape.area();
    if (area > 10) {
      System.out.println("Area=" + area);
    } else {
      System.out.println("it is a small shape.");
    }

    // get radius
    // get Length/Width
    // shape.getLength(); // ! unsafe type, so we have to use "instanceOf" and downcasting
    if (shape instanceof Circle) {
      Circle circle = (Circle) shape;
      System.out.println(circle.getRadius());
    } else if (shape instanceof Rectangular) {
      Rectangular rectangular = (Rectangular) shape;
      System.out.println(rectangular.getLength());
      System.out.println(rectangular.getWidth());
    }

    // Number
    Number number = Long.valueOf(3);
    number = Integer.valueOf(10);
    number = Byte.valueOf("7");
    number = Short.valueOf("8");
    number = Double.valueOf(3.9);
    number = Float.valueOf("8.4");
    
    long value = number.longValue(); // 8.4 -> 8
    System.out.println(value); // 8
    double value2 = number.doubleValue();
    System.out.println(value2);

    // floating point issue
    double d1 = 8.4f;
    System.out.println(d1);

    // Real world: Use int for Integer and double for decimal place
    int y = 3;
    double h = 3.3;
  }
}