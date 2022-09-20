package login;

public class TestUser extends Person{
    String username;

    public TestUser(String username) {
        this.username = username;
    }

    int  pin;
    public void login() {
        System.out.println("test user with username "+ username + "login in system");
    }

    @Override
    public void logout() {
        System.out.println("test user with username "+ "logout in system");
    }
}
