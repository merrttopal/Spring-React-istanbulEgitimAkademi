package works;

import java.util.Scanner;

public class MainWhile {
    public static void main(String[] args) {
        //while
        //while(boolean)

        String[] users = {"Ali","Mehmet","Ahmet","Mert"};
        for (String item : users){
            System.out.println(item);
        }

        System.out.println("===============================");
        for (String item : users){
            System.out.println(item);
        }


        String data = "Bugün günlerden Pazar\n" +
                "Kahvaltı Yapalım.\n" +
                "Sinemaya gidelim";
        Scanner read = new Scanner(data);
        while (read.hasNext()){
            System.out.println(read.nextLine());
        }

        System.out.println("---------------------");


        while (read.hasNext()){
            System.out.println(read.nextLine());

        }

        int i = 0;
        while (i<10){
            System.out.println("While : "+i);
            i++;
        }

        //do - while

        int x = 0;
        do{
            System.out.println(x);
            x++;
        }while(x<5);


    }
}
