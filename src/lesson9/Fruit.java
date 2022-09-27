package lesson9;

public abstract class Fruit {
    private Double weight;
    private Double price;


    public Fruit(Double weight) {
        this.weight = weight;
    }

    public abstract void info();

    public Double getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }
}
