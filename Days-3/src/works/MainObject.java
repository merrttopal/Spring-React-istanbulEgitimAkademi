package works;

import com.sun.javafx.image.impl.IntArgb;

import java.util.Scanner;

public class MainObject {

    public static void main(String[] args) {

        // object türü
        // her türlü veriyi içerisine alabilen türdür

        Object  obj = null;
        obj = 10;
        obj = "istanbul";
        obj = true;
        obj = new Scanner(System.in);

        obj = "son değer,asıl değer";





        if(obj instanceof String ){
            String st = String.valueOf(obj);
            System.out.println(st);

        }
        if(obj instanceof Integer ){
            int num = (int) obj;
        }





        Object num1 = 10;
        Object num2 = 50;
        int sum = (int) num1 + (int) num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(sum);


        Object[] objects = {30,"ali",45,true,21,"A",false,77};
        int sum1 = 0;
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] instanceof Integer) {
                sum1 +=(int) objects[i] ;
            }
        }
        System.out.println(sum1);





    }



}
