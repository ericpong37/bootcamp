
// Citizen -> find Library -> find BookShelf -> find Books (one way relationship)
// book.getBorrower()

import java.util.Objects;

public class Citizen implements Borrowable {
  private String name;
  private Library library;
  private Book[] books;
  private String hkid;

  public Citizen(String name) {
    this.name = name;
  }

  public Citizen(String name, String hkid) {
    this.name = name;
    this.hkid = hkid;
  }

  public String getName() {
    return this.name;
  }

  public void setLibrary(Library library) {
    this.library = library;
  }

  public String getHKID() {
    return this.hkid;
  }

  @Override // hkid
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Citizen))
      return false;
    Citizen citizen = (Citizen) obj;
    return this.hkid.equals(citizen.getHKID());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.hkid);
  }

  @Override
  public boolean borrow(Book book) {
    return this.library.remove(book);
  }

  public Integer search(String bookName) {
    Book book = this.library.search(bookName);
    return book != null ? book.getId() : null;
  }
}
