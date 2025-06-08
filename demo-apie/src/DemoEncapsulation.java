public class DemoEncapsulation {
  public static void main(String[] args) {
    // Encapsulation

    // Role of writing program
    // ! 1. Author
    // ! 2. User

    // ! Author
      // Customer, Order, Item
      // Customer has Orders (Order[])
      // Order has Item (Item[])
        // Customer.class -> add(Order order)
        // Customer.class -> remove(Order order)
        // Order.class -> add(Item item)
        // Order.class -> remove(Item item)
    
    // Encapsulation (done by Author)
      // 1. Author use array to present One to Many (In future, Author can use ArrayList instead of array)
      // AND
      // 2. Provide add() and remove(), but NO setter & getter

    // ! from Author perspective
      // Access Control for attributes (read and write)
      // The ways to store data (data structure)

    // ! from user perspective
    // Readablility (Convenient for calling method, easy to understand)
      // customerA.add(order)
      // orderA.add(itemA)
    
  }
}