import java.util.Scanner;

public class MainReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz!");
        int number = scanner.nextInt();

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = (number % 100) % 10;

        System.out.println(ones + "" + tens + "" + hundreds);
    }
}
