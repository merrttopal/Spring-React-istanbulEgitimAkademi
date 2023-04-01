package overLoad;

public class Action {


    public void call(){

    }


    public int call(int num1){
        return num1 + 1;
    }

    public int call(byte num1){
        return num1 + 2;
    }

    public double call(float num1){
        return num1 + 3;
    }

    public double call(double num1){
        return num1 + 4;
    }





}
