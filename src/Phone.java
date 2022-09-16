import java.util.Objects;

public class Phone {
    String number;
    String model;
    int weight;
    String name = "default";

    {
        number = "Non a number";
        model = "Test-phone";
        weight = 100;
    }


    Phone(){}

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(Phone phone){
        System.out.println("call "+ phone.getNumber());
    }
    void receiveCall(String number, String name){
        System.out.println("call" + number);
        System.out.println(name);

    }

    String getNumber(){
        return number;
    }

    String getName(){
        return name;
    }

    void sendMessage(Phone ...numbers){
        for (Phone item: numbers
             ) {
            System.out.println("SMS to " + item.getNumber());
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (weight != phone.weight) return false;
        if (!Objects.equals(number, phone.number)) return false;
        if (!Objects.equals(model, phone.model)) return false;
        return Objects.equals(name, phone.name);
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + weight;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
