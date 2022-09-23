package library;

import java.time.LocalDate;

public class Reader {
    private String name;
    private int number;
    private Book book;
    private LocalDate date;

    public Reader(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", book=" + book +
                ", date=" + date +
                '}';
    }
}
