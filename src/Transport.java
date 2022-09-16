public class Transport {

    Transport(String name, int price, String owner) {
        this(name, price);

        this.owner = owner;
    }

    Transport(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String color;
    String name;
    int price;
    String owner;

    void move() {
        System.out.println(this.name);
        System.out.println("it is moving");
    }
}
