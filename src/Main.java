import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Добавить к торговому аппарату с горячими напитками Comparable(сортировку по ценам, цены должны быть типа Long)
         */
        Drink drink = new Drink("Чай",500,250);
        //System.out.print(drink);
        DrinkVendingMashine drinkvendingMashine = new DrinkVendingMashine();
        List<Product> array = new ArrayList<>();
        HotDrinkVendingMashine hotDrinkVendingMashine = new HotDrinkVendingMashine();

        //Product product = new Drink("Кофе", 2,350,);
        //Product product1 = new Drink("Чай", 1,500);
        //Product product2 = new Drink("Глинтвейн", 5,400);
        //Product product3 = new Drink("Зеленый чай", 1,350);
        //array.add(product);
        //array.add(product1);
        //array.add(product2);
        //array.add(product3);
        Product product = new HotDrink("Кофе", 2,350,95);
        Product product1 = new HotDrink("Чай", 1,500,50);
        Product product2 = new HotDrink("Глинтвейн", 5,400,40);
        Product product3 = new HotDrink("Зеленый чай", 1,350,105);
        array.add(product);
        array.add(product1);
        array.add(product2);
        array.add(product3);

        //drinkvendingMashine.putProduct(array);
        //System.out.println(drinkvendingMashine.getProductList());
        //System.out.println(drinkvendingMashine.getProduct("Чай",1));
        //System.out.println(drinkvendingMashine.getProductList());
        hotDrinkVendingMashine.putProduct(array);
        System.out.println(hotDrinkVendingMashine.getHotDrinkList());
        System.out.println(hotDrinkVendingMashine.getProduct("Глинтвейн",5,40));
        System.out.println(hotDrinkVendingMashine.getHotDrinkList());

    }
}