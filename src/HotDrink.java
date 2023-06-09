public class HotDrink extends Drink{
    private int temperature;
    public HotDrink(String name, int price, int volume) {
        super(name, price, volume);
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString() + temperature + "\u00B0";
    }

    public HotDrink(String name, int price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }
}
