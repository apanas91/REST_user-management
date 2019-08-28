
import myapp.models.User;
import myapp.services.UserService;


import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
//        User user = new User(3,"Sergey","Apanasenko", "1991-09-29", "apanas91", "passapanas", "pretty", "60 year SSSR street");
//        userService.saveUser(user);
        System.out.println(userService.findUser(1));

//        userService.updateUser(user);
    }
}