public class HotDrink extends Product implements Comparable<HotDrink>{
    private int temperature;

    @Override
    public String getName() {
        return super.name;
    }

    public HotDrink(String name, Long volume, int temperature) {
        super.name = name;
        super.volume = volume;
        this.temperature = temperature;
    }
    @Override
    public String toString() {
        //return super.toString() + temperature + "\u00B0";
        return " Название напитка: " + name + " | " +
                "Объем: " + volume + " | " +
                "Температура напитка: " + temperature + "°" + '\n';
    }


    @Override
    public void setName(String name) {
        super.name = name;

    }

    @Override
    public long getVolume() {
        return super.volume;
    }

    @Override
    public void setVolume(Long volume) {
        super.volume = volume;

    }
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public int compareTo(HotDrink o) {
        if (this.volume > o.volume)
            return  1;
        else if (this.volume < o.volume)
            return -1;
        else
            return 0;
    }
}
