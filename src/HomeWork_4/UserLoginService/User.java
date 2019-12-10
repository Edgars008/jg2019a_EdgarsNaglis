package HomeWork_4.UserLoginService;

public class User {
    private String login;
    private String password;
    private int loginAttemptsLeft;
    private boolean blocked;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        //šeit arī ir jāpalielina loginAttempts, tad stradās pareizi
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginAttemptsLeft() {
        return loginAttemptsLeft;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void resetLoginAttempts(){
       this.loginAttemptsLeft = 3;
    }

    //šai metodei ir jāizmaina "isBlocked" vērtība
    public boolean block(){
       return true;
    }
}
