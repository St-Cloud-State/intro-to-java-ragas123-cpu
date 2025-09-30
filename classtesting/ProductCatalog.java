import java.util.ArrayList;
import java.util.List;

public class ProductCatalog {
    private List<Product> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
    }

    // Insert product
    public void insertProduct(Product p) {
        products.add(p);
    }

    // Search product by ID
    public Product search(String productId) {
        for (Product p : products) {
            if (p.getProductId().equals(productId)) {
                return p;
            }
        }
        return null; // not found
    }

    // Get all products
    public List<Product> getAllProducts() {
        return products;
    }
}
