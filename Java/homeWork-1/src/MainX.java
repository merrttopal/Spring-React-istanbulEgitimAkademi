import java.util.Scanner;

public class MainX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kac sayi gireceksiniz?");
        int n = input.nextInt();
        int positiveCount = 0,
                negativeCount = 0,
                        evenCount = 0,
                            oddCount = 0,
                                total = 0;
        double average;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + ". sayiyi giriniz:");
            int number = input.nextInt();
            total += number;
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        average = (double) total / n;

        System.out.println("Girilen " + n + " sayidan:");
        System.out.println(positiveCount + " tanesi pozitif");
        System.out.println(negativeCount + " tanesi negatif");
        System.out.println("En buyuk: " + max);
        System.out.println("En kucuk: " + min);
        System.out.println(evenCount + " tanesi cift");
        System.out.println(oddCount + " tanesi tek");
        System.out.println("Toplamlari: " + total);
        System.out.println("Ortalamalari: " + average);
    }
}
