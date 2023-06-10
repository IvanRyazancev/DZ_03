public abstract class Product {
    protected String name;
    protected long volume;

    public abstract String getName();
    public abstract void setName(String name);

    public abstract long getVolume();

    public abstract void setVolume(Long volume);
}
