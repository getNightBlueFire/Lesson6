package login;

import java.util.UUID;

public class Run {
    public static void main(String[] args) {

        Person[] users = new Person[10];
        TestUser user = new TestUser("test1");
        TestUser user1 = new TestUser("test2");
        TestUser user2 = new TestUser("test3");
        for (int i = 0; i<10;i++){
            String s = UUID.randomUUID().toString();
            String s1 = s.split("-")[0];
            users[i] = new User(s1, s);
        }
        users[7] = user;
        users[8] = user1;
        users[9] = user2;

        for (Person u : users
             ) {

            //System.out.println(u.toString());
        }

        for (int i = 0; i < 10; i++) {
            users[i].login();
        }

        for (int i = 0; i < 10; i++) {
            users[i].logout();
        }
    }
}
