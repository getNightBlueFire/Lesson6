package lesson9;

public class Apple extends Fruit{
    private Double info;

    public Apple(Double weight, Double info) {
        super(weight);
        this.info = info;
    }

    @Override
    public void info() {
        super.setPrice(this.info * super.getWeight());
    }
}
