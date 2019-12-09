package HomeWork_4.UserLoginService;

public class UserLoginService {



public boolean login(String inputPassword, User user){

    if (inputPassword == user.getPassword()){
        user.resetLoginAttempts();
        System.out.println("Lietotājs identificēts");
    } else if (inputPassword != user.getPassword()){
       int count = user.getLoginAttemptsLeft();

        System.out.println("Nepareiza parole atlikuši " + count + " mēģinājumi!");
        if (count == 1){
            user.block();
            System.out.println("Lietotājs bloķets!");
        }
    }

    return false;
}

//lieka metode
public void verify(User user){


}

}
