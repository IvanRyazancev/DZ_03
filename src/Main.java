import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*
        Добавить к торговому аппарату с горячими напитками Comparable(сортировку по ценам, цены должны быть типа Long)
         */
        HotDrink coffe = new HotDrink("jardin", (long) 100, 85);
        HotDrink cacao = new HotDrink("cacao", (long) 50, 95);
        HotDrink tea = new HotDrink("Lipton", (long) 60, 100);
        HotDrink greenTea = new HotDrink("Greenfield", (long) 75, 100);
        ArrayList<HotDrink> hotDrinks = new ArrayList<>();
        hotDrinks.add(coffe);
        hotDrinks.add(cacao);
        hotDrinks.add(tea);
        hotDrinks.add(greenTea);

        HotDrinkVendingMashine hdvm = new HotDrinkVendingMashine() {
            @Override
            public HotDrink putHotProduct(String a, Long b, int c) {
                return null;
            }
        };
        hdvm.putHotProduct(hotDrinks);

        System.out.println(("=========================================="));
        System.out.println(("Список горячих напитков в апарате: "));
        System.out.println((hdvm));
        System.out.println(("=========================================="));
        Collections.sort(hotDrinks);
        System.out.println(("Отсортированный список горячих напитков в аппарате: "));
        System.out.println((hdvm));
    }
}