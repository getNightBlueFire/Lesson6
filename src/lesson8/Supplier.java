package lesson8;

public class Supplier extends Document {
    String type;
    int count;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Supplier(String numDoc, String type, int count) {
        super(numDoc);
        this.count = count;
        this.type = type;
    }

    @Override
    protected void docInfo() {
        System.out.println("This number of document " + this.numDoc);
        System.out.println("This date " + this.date);
        System.out.println("This count " + this.count);
        System.out.println("This type " + this.type);
    }
}
