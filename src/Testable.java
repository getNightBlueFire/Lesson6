public interface Testable {
    void test();
    void afterTest();
    void beforeTest();
    void print();
    default void test0(){

    }

    interface Test{
        void test0();
    }
}
