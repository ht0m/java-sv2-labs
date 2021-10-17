package classstructureintegrate;

public class Product {

    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

     public void increasePrice (int amount) {
        this.price = this.price + amount;

     }
    public void decreasePrice (int amount) {
        this.price = this.price - amount;
    }

}