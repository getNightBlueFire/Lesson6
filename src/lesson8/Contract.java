package lesson8;

import java.time.LocalDate;

public class Contract extends Document {
    String name;
    LocalDate dateEnd = LocalDate.now().plusYears(5);

    public Contract(String numDoc, String name) {
        super(numDoc);
        this.name = name;
    }

    @Override
    protected void docInfo() {
        System.out.println("This name " + this.name);
        System.out.println("This number of document " + this.numDoc);
        System.out.println("This date " + this.date);
        System.out.println("This end of contract " + this.dateEnd);
    }

}
