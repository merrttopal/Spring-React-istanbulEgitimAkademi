package com.works;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
        //Scanner Class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız");
        String name = scanner.nextLine();

        System.out.println("Soyadınız");
        String lastName = scanner.nextLine();

        System.out.println("Yaşınız ");
        int age = scanner.nextInt();


        String total = name+" "+lastName + " " +"Yaşınız: "+ age;

        System.out.println("Adınız Soyadınız : "+ " " + total);


    }
}
