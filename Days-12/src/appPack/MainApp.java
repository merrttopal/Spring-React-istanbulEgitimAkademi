package appPack;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // exceptions -> istisnalar
        // hata olasılığında kullanılır
        // hata olduğunda uygulamanın devamlılığını sağlar

        try {
            String stnum = "30a";
            int num = Integer.parseInt(stnum);
            int i = 1/0;
            System.out.println("Code block Success");
        }
        catch (Exception e){
            System.err.println("Code block Fail");
            System.err.println(e);
            }

        System.out.println("This line call");

        System.out.println("////////////////////////////");

        Action action = new Action();
        try {
            action.call(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("////////////////////////////");

        try{

        }catch (Exception a){

        }finally {
            System.out.println("her türlü çalıştım");
        }

        try{
            System.out.println("DB open");
            System.out.println("InsertDB");

        }
        catch (Exception a){}
        finally {
            System.out.println("DB Close");
            System.out.println("her türlü çalıştım");
        }


    }
}
