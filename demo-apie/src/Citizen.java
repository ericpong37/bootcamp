
// Citizen -> find Library -> find BookShelf -> find Books (one way relationship)
// book.getBorrower()
public class Citizen implements Borrowable {
  private String name;
  private Library library;
  private Book[] books;

  public Citizen(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setLibrary(Library library) {
    this.library = library;
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
