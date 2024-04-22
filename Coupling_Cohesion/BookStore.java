public class BookStore {
    public static void main(String[] args) {
        // Create instances of Book, Inventory, and ShoppingCart
        Book book1 = new Book("Java Programming", "John Doe", 1999.99);
        Book book2 = new Book("Data Structures", "Jane Smith", 12000);

        Inventory inventory = new Inventory();
        ShoppingCart cart = new ShoppingCart();

        // Add books to inventory
        inventory.addBook(book1);
        inventory.addBook(book2);

        // Add books to shopping cart
        cart.addItem(book1);
        cart.addItem(book2);

        // Display inventory
        inventory.displayInventory();

        // Display total price of items in shopping cart
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total Price of Items in Shopping Cart: Rs." + totalPrice);
    }
}
