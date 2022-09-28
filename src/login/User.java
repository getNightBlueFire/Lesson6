package login;

public class User extends Person{
    String username;
    String password;



    @Override
    public void login() {
        System.out.println("user with username "+ username + "login in system");
    }

    @Override
    public void logout() {
        System.out.println("user with username "+ "logout in system");
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
