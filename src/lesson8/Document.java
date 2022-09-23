package lesson8;

import java.time.LocalDate;

public abstract class Document {
    String numDoc;
    protected LocalDate date = LocalDate.now();

    public Document(String numDoc) {
        this.numDoc = numDoc;
    }

    protected abstract void docInfo();

    final void test(){
        System.out.println("hello");
        System.out.println(numDoc);
    }

}
