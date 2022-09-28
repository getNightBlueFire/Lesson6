package library;

import java.time.LocalDate;

public class CreditCard {
    private final int number;
    private final int ccv;
    private final LocalDate date = LocalDate.now();

    public CreditCard(int number, int ccv) {
        this.number = number;
        this.ccv = ccv;
    }

    public int getNumber() {
        return number;
    }

    public int getCcv() {
        return ccv;
    }

    public LocalDate getDate() {
        return date;
    }


}
