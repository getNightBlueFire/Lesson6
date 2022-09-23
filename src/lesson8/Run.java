package lesson8;

public class Run {

    public static void main(String[] args) {
        Contract contract = new Contract("123456789", "dima");
        Supplier supplier0 = new Supplier("123456798", "test1", 10);
        Supplier supplier1 = new Supplier("123456790", "test2", 20);
        Invoice invoice0 = new Invoice("1234", 10, 204);
        Invoice invoice1 = new Invoice("1235", 20, 404);

        int code = invoice0.getCode();
        System.out.println(code);
        invoice0.setResult(11);

        Register register = new Register();

        register.save(contract);
        register.save(supplier0);
        register.save(supplier1);
        register.save(invoice0);
        register.save(invoice1);

        register.info(3);

    }

}
