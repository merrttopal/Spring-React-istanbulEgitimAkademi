import models.User;

import java.sql.Date;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {
        UserService userService = new UserService();
        ProductService productService = new ProductService();
        /*
        User user = new User("Enes", "ünal", "enes@mail.com", "12345", true, 21);
        UserService userService = new UserService();
        int status = userService.save(user);
        System.out.println("User status: " + status);
        if (status > 0) {
            System.out.println("Insert Success");
        } else {
            System.out.println("Duplicate Email Entry Problem");
        }

        Product product = new Product("iphone 14pro max", 59999);
        ProductService productService = new ProductService();
        status = productService.save(product);
        System.out.println("Product Status: " + status);
*/
       // int statusDelete = userService.delete(102,103,104,105);
       // System.out.println("StatusDelete = "+ statusDelete);
        /*
        User user = new User("Enes", "ünal", "enesa@mail.com", "12345", true, 21);
        user.setUid(106);
        int statusUpdate = userService.update(user);
        System.out.println("statusUpdate: " + statusUpdate);

        userService.allList();

        List<User> ls = userService.allList();
        for(User item : ls){
            System.out.println(item.getUid());
        }

        userService.userSearch("mert",0);
*/
        Boolean loginStatus = userService.userLogin("merrt.topal@gmail.com","12345");
        System.err.println(loginStatus);
    }
}
