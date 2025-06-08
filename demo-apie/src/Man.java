
public class Man {
  private static final int FIXED_TURN_DEGREE = 10;
  private int degree;

  public Man() {
    this.degree = 0;
  }

  // 1 -> EAST
  // 2 -> SOUTH
  // 3 -> WEST
  // 0 -> NORTH
  public String getDirection() { // EAST, SOUTH, NORTH, EAST
    int extra = this.degree % 90 < 45 ? 0 : 1;
    System.out.println(extra);
    int result = this.degree / 90 + extra;
    // 350 / 90 + 1 -> 4
    System.out.println(result);
    switch (result) {
      case 0:
        return "NORTH";
      case 1:
        return "EAST";
      case 2:
        return "SOUTH";
      case 3:
        return "WEST";
      case 4:
        return "NORTH";
      default:
        return null;
    }
  }

  // 0 - 10 -> 350
  // 360 / 350
  public void turnLeft() { // 10 degree
    this.degree = (this.degree - FIXED_TURN_DEGREE + 360) % 360;
    System.out.println(this.degree);
  }

  // 350 + 10 -> 0
  public void turnRight() { // 10 degree
    this.degree = (this.degree + FIXED_TURN_DEGREE + 360) % 360;
    System.out.println(this.degree);
  }

  public static void main(String[] args) {
    Man man = new Man();
    man.turnLeft();
    man.turnLeft();
    man.turnLeft();
    man.turnLeft();
    man.turnLeft();
    man.turnLeft();
    man.turnLeft();
    man.turnLeft();
    man.turnLeft();
    man.turnLeft();
    System.out.println(man.getDirection());

  }
}
