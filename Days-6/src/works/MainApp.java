package works;

import java.util.Set;

public class MainApp {
    public static void main(String[] args) {

        BankCustomer customer = new BankCustomer();

        String name = customer.userName(78266265068L);
        System.out.println(name);
        System.out.println("This Line Call");

        //normal değişken

        System.out.println(customer.city);
        customer.city ="ankara";
        System.out.println(customer.city);
        System.out.println(customer.hashCode());


        // Static using
        Settings settings = new Settings();

        settings.userNameSet();

        System.out.println(BankCustomer.name);
        BankCustomer.name = "Mert Topal";
        System.out.println(BankCustomer.name);


    }
}
