package works;

public class Settings {

    //Final anahtar kelimesi
    // değişken yada nesneleri sabit tutmak için kullanılır
    final static  User user = new User();


    public void userNameSet(){
        System.out.println("userNameSet: " + BankCustomer.name);
        BankCustomer bankCustomer = new BankCustomer();
        System.out.println("userNameSet: " + bankCustomer.city);
        System.out.println(bankCustomer.hashCode());
        final String email = "asda@email.com";
    }
    // Static Method

    public static  void action(){
        String status = "a10";
        System.out.println(status);
        int age = 21;
        System.out.println(age);
    }
}
