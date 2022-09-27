package lesson9;

public class Orange extends Fruit {

    private Double inf0;

    public Orange(Double weight, Double inf0) {
        super(weight);
        this.inf0 = inf0;
    }

    @Override
    public void info() {
        super.setPrice(this.inf0 * super.getWeight());
    }
}
