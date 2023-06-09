import java.util.ArrayList;
import java.util.List;

public class DrinkVendingMashine implements VendingMashine {
    private List<Product> productList;
    @Override
    public Product getProduct() {
        return null;
    }
    public DrinkVendingMashine() {
        this.productList = new ArrayList<>();
    }
    @Override
    public Product getProduct(String name) {

        return null;
    }

    @Override
    public Product getProduct(String name, int price) {
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getName().equals(name)&&productList.get(i).getPrice() == price){
                return productList.remove(i);
            }
        }
        return null;
    }

    @Override
    public void putProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void putProduct(List<Product> products) {
        productList.addAll(products);
    }
    public List<Product> getProductList() {
        return productList;
    }
}
