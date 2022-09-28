package library;

import java.time.LocalDate;

public class Person {
    private final String name;
    private int department;
    private final LocalDate date = LocalDate.now();
    private int phone;
    private CreditCard creditCard;

    public Person(String name, int department, int phone) {
        this.name = name;
        this.department = department;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }
}
