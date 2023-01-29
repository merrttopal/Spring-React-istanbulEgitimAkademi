package appPack;

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Lütfen bir tam sayı giriniz.");
                int isNum = Integer.parseInt(scanner.nextLine());
                System.out.println("Sayısal değer girdiniz");
                break;
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
