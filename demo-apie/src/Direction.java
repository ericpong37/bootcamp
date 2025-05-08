public enum Direction {
  // ! someone help you call Direction(int value) to create Direction object

  // 4 enum object here ...
  EAST(1), //
  SOUTH(2), //
  WEST(3), //
  NORTH(4), //
  ;

  private int value;

  // enum constructor -> private
  private Direction(int value) {
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public static Direction of(int value) {
    // for loop
    for (Direction d : Direction.values()) {
      if (d.getValue() == values)
        return d;
    }
    return null;
  }
}
