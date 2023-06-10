import java.util.ArrayList;

public interface VendingMashine {
    public void putHotProduct(ArrayList<HotDrink> item);
    public HotDrink putHotProduct(String a, Long b, int c);

    HotDrink getHotProduct(String a, Long b, int c);
}
