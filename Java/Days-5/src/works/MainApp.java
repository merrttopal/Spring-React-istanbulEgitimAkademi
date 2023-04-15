package works;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        // Action action =  new Action("Spring Java");
        // action.count();
        Action action2 =  new Action();


        Call call = new Call(5.0);
        double end = call.action();
        System.out.println(end);

    }

    // sınıf
    // call
    //new Call(40,50)
    // call.action()-> topla
    // call(50)
    //call.action()-> karesini al
    //call call = new Call(5.4);
    // call.action() -> daire alanı


}
