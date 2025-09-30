public class WishlistItemTest {
    public static void main(String[] args) {
        WishlistItem w1 = new WishlistItem("W1", "P1", 2);

        System.out.println("Initial Wishlist Item: " + w1);
        System.out.println("Product ID in wishlist: " + w1.getProduct());
        System.out.println("Initial Quantity: " + w1.getQuantity());

        w1.setQuantity(5);
        System.out.println("Updated Wishlist Item: " + w1);

        // Example of error case
        try {
            w1.setQuantity(0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
