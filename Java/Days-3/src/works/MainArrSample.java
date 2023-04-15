package works;

import java.util.Scanner;

public class MainArrSample {
    public static void main(String[] args) {
        // kullanıcı stok girişi
        // kaç kalem ürün olduğunu kullanıcı belirler

        //

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kaç Adet ürününüz var");
            int product = scanner.nextInt();

            if (product > 0) {
                int sum = 0;
                int[] products = new int[product];
                for (int i = 0; i < products.length; i++) {
                    System.out.println((i + 1) + "'. Ürünün stoğunu giriniz.");
                    products[i] = scanner.nextInt();
                    sum += products[i];
                }
                System.out.println("Toplam stok: " + sum);
                break;
            } else {
                System.out.println("Lütfen pozitif değer giriniz.");
            }
        }
    }
}
