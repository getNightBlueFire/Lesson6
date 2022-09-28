package lesson9;

public class Storage {

    private final Fruit[] fruits;

    {
        fruits = new Fruit[10];
    }

    public Fruit[] getFruits() {
        return fruits;
    }

    public void infoAbout(){
        double s = 0;
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] != null) {
                fruits[i].info();
                s = s + fruits[i].getPrice();

            }
        }
        System.out.println(s);
    }

    public void infoAbout(Apple[] apples){
        for (Apple it: apples) {
            it.info();

        }
    }

    public void infoAbout(String type){
        int s = 0;
        for (int i = 0; i < getFruits().length; i++) {
            if(getFruits()[i] != null){
                if(getFruits()[i] instanceof Apple)
                if (getFruits()[i].getClass().getSimpleName().equals(type)){
                    getFruits()[i].info();
                    s += getFruits()[i].getPrice();
                }
            }
        }
        System.out.println(s);
    }

    public void addFruit(Fruit fruit){
        for (int i = 0; i < getFruits().length; i++) {
            if (getFruits()[i] == null) {
                getFruits()[i] = fruit;
                break;
            }
        }
    }

}
