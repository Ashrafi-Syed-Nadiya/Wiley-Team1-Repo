import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Book> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // Calculate the total price of items in the shopping cart
    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Book item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    // Add a book to the shopping cart
    public void addItem(Book book) {
        items.add(book);
    }

    // Remove a book from the shopping cart
    public void removeItem(Book book) {
        items.remove(book);
    }

    // Display the details of all items in the shopping cart
    public void displayItems() {
        System.out.println("Shopping Cart Items:");
        for (Book item : items) {
            System.out.println(item.getTitle() + " by " + item.getAuthor() + " - $" + item.getPrice());
        }
    }
}
