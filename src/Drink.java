public class Drink extends Product{
    private int volume;
    public int getVolume() {
        return volume;
    }


    public Drink(String name, int price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + volume + "ml ";
    }
}
