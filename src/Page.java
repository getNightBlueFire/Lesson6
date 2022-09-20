public class Page implements Printable, Testable{
    String test;
    {
        test = "lol";
    }

    @Override
    public void print() {

    }

    @Override
    public void test0() {
        if (true){
            Testable.super.test0();

        } else {
            Printable.super.test0();

        }
    }

    @Override
    public void test() {

    }

    @Override
    public void afterTest() {

    }

    @Override
    public void beforeTest() {

    }
}
