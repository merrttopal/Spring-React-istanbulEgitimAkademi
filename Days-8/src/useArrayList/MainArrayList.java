package useArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MainArrayList {
    public static void main(String[] args) {
        // ArrayList
        // Mutable (daha sonradan değiştirilebilir özelliğe sahip Dizi elemanlarıdır)
        // ArrayList bir sınıftır, List implement almıştır
        // ArrayList kurarken hangi tür için çalışacağını belirtmek gerekir
        // ArrayList generic type'tır (oluşurken tür alırlar)

        ArrayList<String> list = new ArrayList<>();

        // Add item
        list.add("Istanbul");
        list.add("Ankara");
        list.add("Antalya");
        list.addAll(Arrays.asList("Adana","Mugla","İzmir","Samsun"));

        // Get item
        String item = list.get(0);
        System.out.println(item);
        System.out.println(list);

        // Total size
        int size = list.size();
        System.out.println(size);

        // Total items
        for (String city: list) {
            System.out.println(city);
        }
    }
}
