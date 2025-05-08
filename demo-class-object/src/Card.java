
public class Card {
  // ! static -> common values for all objects (Not belongs to objects)
  // ! final -> Cannot modify the value after initialization
  // Non-Static and Non-Final
  // Static and Non-Final
  // Non-static and Final
  // Static and Final
  public static final char DIAMOND = '1'; // constant
  public static final char CLUB = '2'; // constant
  public static final char HEART = '3'; // constant
  public static final char SPADE = '4'; // constant

  public static final char ACE = 'Z'; // constant
  public static final char TWO = '2'; // constant
  public static final char THREE = '3'; // constant
  public static final char FOUR = '4'; // constant
  public static final char FIVE = '5'; // constant
  public static final char SIX = '6'; // constant
  public static final char SEVEN = '7'; // constant
  public static final char EIGHT = '8'; // constant
  public static final char NINE = '9'; // constant
  public static final char TEN = 'V'; // constant
  public static final char JACK = 'W'; // constant
  public static final char QUEEN = 'X'; // constant
  public static final char KING = 'Y'; // constant

  // 1. Readability
  // 2. Data Type Range

  // Attributes
  private char rank; // 1,2,3,4,5,6,7,8,9,T,J,Q,K
  private char suit; // D, C, H, S

  // Constructor
  public Card(char rank, char suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public char getRank() {
    return this.rank;
  }

  public char getSuit() {
    return this.suit;
  }

  public void setRank(char rank) {
    this.rank = rank;
  }

  public void setSuit(char suit) {
    this.suit = suit;
  }

  public boolean isRed() {
    if (suit == DIAMOND || suit == HEART)
      return true;
    return false;
  }

  // this (self)
  public boolean equals(Card card) {
    return this.rank == card.getRank() && this.suit == card.getSuit();
  }

  // 10.compareTo(3) -> 1
  // 3.comapare(10) -> -1

  // 0, -1, 1
  public int compareTo(Card card) {
    if (this.rank == card.getRank()) {
      if (this.suit > card.getSuit()) {
        return 1;
      } else if (this.suit < card.getSuit()) {
        return -1;
      }
      return 0;
    }
    // different ranks
    return this.rank > card.getRank() ? 1 : -1;
  }

  public String toString() {
    return "Card(" + "rank=" + this.rank + " ,suit=" + this.suit + ")";
  }

  public static void main(String[] args) {
    Card c1 = new Card(TWO, CLUB);
    Card c2 = new Card(TWO, CLUB);
    System.out.println(c1.equals(c2)); // true
    Card c3 = new Card(THREE, CLUB);
    System.out.println(c1.equals(c3)); // false
    Card c4 = new Card(TWO, HEART);
    System.out.println(c1.equals(c4)); // false
    Card c5 = new Card(ACE, SPADE);
    System.out.println(c1.equals(c5)); // false

    System.out.println(c1.compareTo(c2)); // 0
    System.out.println(c1.compareTo(c3)); // -1
    System.out.println(c5.compareTo(c1)); // 1

    Card c6 = new Card(ACE, DIAMOND);
    System.out.println(c5.compareTo(c6)); // 1

    System.out.println(c6); // Card(rank=Z ,suit=1)
  }

}
