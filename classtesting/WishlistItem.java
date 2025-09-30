public class WishlistItem {
    private String wishlistItemId;
    private String productId;
    private int desiredQty;

    public WishlistItem(String wishlistItemId, String productId, int desiredQty) {
        if (desiredQty <= 0) {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
        this.wishlistItemId = wishlistItemId;
        this.productId = productId;
        this.desiredQty = desiredQty;
    }

    // Return productId (link to ProductCatalog externally if needed)
    public String getProduct() {
        return productId;
    }

    public int getQuantity() {
        return desiredQty;
    }

    public void setQuantity(int qty) {
        if (qty > 0) {
            this.desiredQty = qty;
        } else {
            throw new IllegalArgumentException("Quantity must be greater than 0");
        }
    }

    @Override
    public String toString() {
        return "WishlistItem{id='" + wishlistItemId + "', productId='" + productId + "', qty=" + desiredQty + "}";
    }
}
