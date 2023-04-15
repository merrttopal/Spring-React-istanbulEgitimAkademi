package works;


public class MainStaticMethod {
    public static void main(String[] args) {

        //Static Method Call
        Settings.action();
        String address = "ankara";

        // Static Object Call
        System.out.println(Settings.user.hashCode());
        Settings.user.getEmail();
        Settings.user.email = "m@mail.com";
        Settings.user.getEmail();

        //
        // Settings.user = new User();
        System.out.println(Settings.user.hashCode());
        Settings.user.getEmail();
        MainStaticMethod mainStaticMethod = new MainStaticMethod();
        mainStaticMethod.read();


    }
    public void read(){
        System.out.println("read call");
    }
}
