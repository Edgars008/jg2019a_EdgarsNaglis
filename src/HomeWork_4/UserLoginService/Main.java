package HomeWork_4.UserLoginService;

public class Main {
    public static void main(String[] args) {
        User edgars = new User("Edgars008", "koks123");
        UserLoginService newLogin = new UserLoginService();

        newLogin.login("koks123",edgars);
        newLogin.login("koks1234",edgars);
        newLogin.login("koks12345",edgars);
        newLogin.login("koks123456",edgars);
        newLogin.login("koks123456",edgars);

    }
}
