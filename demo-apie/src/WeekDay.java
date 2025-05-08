public enum WeekDay {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,;

  public static void main(String[] args) {
    // loop enum values
    for (WeekDay day: WeekDay.values()) {
      System.out.println(day);
    }
  }
}
