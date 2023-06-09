import java.util.List;

public interface VendingMashine {
    public Product getProduct();
    public Product getProduct(String name);
    public Product getProduct(String name, int price);

    public void putProduct(Product product);
    public void putProduct(List<Product> products);

}
