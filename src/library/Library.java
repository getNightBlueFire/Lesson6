package library;

import java.time.LocalDate;
import java.util.Arrays;

public class Library {
    public Reader[] getReaders() {
        return readers;
    }

    private Reader[] readers = new Reader[10];
    private final Book[] books = new Book[10];

    public Library() {
        this.books[0] = new Book("Test1");
        this.books[1] = new Book("Test2");
        this.books[2] = new Book("Test3");
        this.books[3] = new Book("Test4");
        this.books[4] = new Book("Test5");
        this.books[5] = new Book("Test6");
        this.books[6] = new Book("Test7");
        this.books[7] = new Book("Test8");
        this.books[8] = new Book("Test9");
        this.books[9] = new Book("Test0");
    }

    public void registerReader(Person person){
        Reader reader = new Reader(person.getName(), person.getPhone());
        for (int i = 0; i < readers.length; i++) {
            if (readers[i] == null){
                readers[i] = reader;
                break;
            }
        }
    }

    public void takeBook(int number, int i){
        Reader readerByPhoneNumber = Arrays.stream(this.readers).filter(reader -> reader.getNumber() == number).findFirst().get();
        if(readerByPhoneNumber.getBook() == null){
            readerByPhoneNumber.setBook(this.books[i]);
            readerByPhoneNumber.setDate(LocalDate.now());
        }
    }

    public void returnBook(int number){
        Reader readerByPhoneNumber = Arrays.stream(this.readers).filter(reader -> reader.getNumber() == number).findFirst().get();
        if(readerByPhoneNumber.getBook() != null){
            readerByPhoneNumber.setBook(null);
            readerByPhoneNumber.setDate(null);
        }
    }



}
