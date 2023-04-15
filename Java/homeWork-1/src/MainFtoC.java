import java.util.Scanner;

public class MainFtoC {
    public static void main(String[] args) {



        while (true) {
            Scanner menu = new Scanner(System.in);

            System.out.println("Menu\n" +
                    "1) F -> C\n" +
                    "2) C - >F");

            int menuSelect =  menu.nextInt();
            if (menuSelect == 1) {

                System.out.println("F değerini giriniz.");
                Scanner value = new Scanner(System.in);
                double fahreanheit = value.nextDouble();
                double celcius = (fahreanheit - 32) * (5 / 9D);
                System.out.println("xF = " + celcius + "C");
                break;

            } else if (menuSelect == 2) {

                System.out.println("C değerini giriniz.");
                Scanner value = new Scanner(System.in);
                double celcius = value.nextDouble();
                double fahreanheit = (celcius * 1.80000) + 32;
                System.out.println("xC = " + fahreanheit + "F");
                break;
            }
            else   {
                System.out.println("Seçilebilir bir değer giriniz.");

            }
        }
    }
}
