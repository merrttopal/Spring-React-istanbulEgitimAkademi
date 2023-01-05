import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args) {
        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Kenar 1: ");
            int side1 = scanner.nextInt();

            System.out.println("kenar 2: ");
            int side2 = scanner.nextInt();

            System.out.println("3. Kenarı giriniz.");
            int side3 = scanner.nextInt();

            if (side1 > 0&& side2>0 && side3>0) {
                if (   ((side1 + side2) > side3)    &&   ((side1 + side3) > side2)   &&   ((side2 + side3) > side1)   ) {
                    System.out.println("Kenarlardan üçgen elde edilebilir.");
                    break;
                } else {
                    System.out.println("Kenarlardan üçgen elde edilemez.");
                }

            }else {
                System.out.println("Pozitif bir değer giriniz!!");
            }
        }
    }

}