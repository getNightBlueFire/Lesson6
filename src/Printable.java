public interface Printable {

    int test1 = 10;

    void print();

    default void test0(){
        test();
    }

    static void test3(){
        System.out.println("static");
    }

    private void test(){
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}
