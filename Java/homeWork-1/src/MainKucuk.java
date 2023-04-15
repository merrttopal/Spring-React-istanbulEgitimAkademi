import java.util.Scanner;

public class MainKucuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numa,numb;
        System.out.print("1. Sayı: ");
        numa = input.nextInt();
        System.out.print("2. Sayı: ");
        numb = input.nextInt();


        if (numa<numb){
            System.out.println("1. Sayı 2. sayıdan küçüktür "+"("+numa+" < "+numb+")");
        } else if (numa ==numb ) {
            System.out.println("Sayılar Eşittir.");
        }else {
            System.out.println("2. Sayı 1. sayıdan küçüktür"+"("+numb+"<"+numa+")");
        }
    }
}
