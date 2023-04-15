import java.util.Scanner;

public class MainN {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("n ==>");
            int n = scanner.nextInt();

            if (n > 0) {
                int total = (n*(n+1))/2;
                System.out.println("1'den N'e kadar olan sayılar toplamı:  "+ total);
                break;
            } else {
                System.out.println("Lütfen pozitif değer giriniz.");
            }
        }
    }
}
