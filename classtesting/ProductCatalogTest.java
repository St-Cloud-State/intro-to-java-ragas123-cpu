public class ProductCatalogTest {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        Product p1 = new Product("P1", "Laptop");
        Product p2 = new Product("P2", "Mouse");
        Product p3 = new Product("P3", "Keyboard");

        catalog.insertProduct(p1);
        catalog.insertProduct(p2);
        catalog.insertProduct(p3);

        System.out.println("All products: " + catalog.getAllProducts());
        System.out.println("Search P2: " + catalog.search("P2").getName());
        System.out.println("Search P4 (not in catalog): " + catalog.search("P4"));
    }
}
