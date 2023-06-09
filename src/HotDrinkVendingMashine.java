import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMashine implements VendingMashine {
    List<Product> hotDrinkList;

    @Override
    public Product getProduct() {
        return null;
    }

    @Override
    public Product getProduct(String name) {
        return null;
    }

    @Override
    public Product getProduct(String name, int price) {

        return null;
    }

    public Product getProduct(String name, int price, int temperature) {
        for (int i = 0; i < hotDrinkList.size(); i++) {
            //HotDrink hotDrink = (HotDrink) hotDrinkList.get(i);
            if (hotDrinkList.get(i).getName().equals(name) && hotDrinkList.get(i).getPrice() == price &&
                    ((HotDrink) hotDrinkList.get(i)).getTemperature() == temperature) {
                return hotDrinkList.remove(i);
            }
        }
        return null;

    }

    @Override
    public void putProduct(Product product) {

    }

    @Override
    public void putProduct(List<Product> products) {
        hotDrinkList.addAll(products);

    }

    public HotDrinkVendingMashine() {
        this.hotDrinkList = new ArrayList<>();
    }

    public List<Product> getHotDrinkList() {
        return hotDrinkList;
    }
}
