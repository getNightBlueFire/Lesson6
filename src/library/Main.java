package library;

public class Main {
    public static void main(String[] args) {

        Person person0 = new Person("jack", 101, 1234567);
        Person person1 = new Person("joe", 102, 1234577);
        Person person2 = new Person("nick", 103, 1234777);

        Library library = new Library();
        library.registerReader(person0);
        library.registerReader(person1);
        library.registerReader(person2);

//        System.out.println(library.getReaders()[0]);
//        System.out.println(library.getReaders()[1]);
//        System.out.println(library.getReaders()[2]);
//
//        System.out.println(library.getReaders()[0]);
        library.takeBook(1234567, 5);



    }
}
