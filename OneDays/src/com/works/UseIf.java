package com.works;

public class UseIf {
    public static void main(String[] args) {
        //if
        //  if(boolean)  { koşul sağlandığında çalışır }


        int num1 = 10;
        int num2 = 11;

        boolean status = num1 > num2;//büyükse
        status = num1 < num2;//küçükse
        status = num1 == num2;//eşitse
        status = (num1 >= num2) ;

        if(status){
            System.out.println("Koşul sağlanıyor");
        }
        else{
            System.out.println("Koşul sağlanmıyor");
        }

        //logic
        // && , ||
    }
}
