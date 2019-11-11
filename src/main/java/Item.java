public class Item {
    private double price;
    private String name;

    public Item(String name, double price) {
        if (name == null) {
            throw new IllegalArgumentException("Nazwa nie może być pusta!");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Cena nie może być mniejsza od zera!");
        }
        setName(name);
        setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Cena nie może być mniejsza od zera!");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Nazwa nie może być pusta!");
        }
        this.name = name;
    }
}
