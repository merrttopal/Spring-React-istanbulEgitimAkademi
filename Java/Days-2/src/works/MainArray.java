package works;

import java.util.ArrayList;

public class MainArray {
    public static void main(String[] args) {
        //array
        //diziler
        // String[] diziAdi = {"aa", "bb"};

        String[] cities = {"Istanbul", "Ankara","Izmir","Mugla","Aydın"};
        String[] citiess = {"Istanbul", "Istanbul","Istanbul","Istanbul","Istanbul"};

        System.out.println(cities);

        // single item
        // index-> 0'dan başlar
        System.out.println(cities[0]);
        // item value chance
        cities[1] = "Antalya";
        System.out.println(cities[1]);
        System.out.println(cities[2]);
        System.out.println(cities[3]);
        System.out.println(cities[4]);

        // array size
        int size = cities.length;
        System.out.println(size);

        int i = 5;
        if(i >= 0 && i< cities.length){
            System.out.println(cities[i]);
        }else {
            System.out.println("Not Found Index");
        }





    }
}
