package oop;

public class Action {
    int a = 10;
    Settings settings = new Settings();
    public Action() {
        System.out.println("oop.Action call");
    }

    public Action(int a) {
        this.a = a;
    }

    public Action(Settings settings) {
        a = settings.sum(5,7);
    }

    public  int call (int a){
       return a*a;
    }
}
