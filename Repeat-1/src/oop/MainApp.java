package oop;

import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        Action action = new Action();
        Action action1 = new Action(1111);
        Settings settings = new Settings();
        Action action2 = new Action(settings);
        System.out.println(action2.call(10));


    }
}
