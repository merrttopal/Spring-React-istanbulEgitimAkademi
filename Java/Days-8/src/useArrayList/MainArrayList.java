package useArrayList;

import java.util.*;

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
        list.addAll(Arrays.asList("Adana", "Mugla", "İzmir", "Samsun"));

        // Get item
        String item = list.get(0);
        System.out.println(item);


        // Total size
        int size = list.size();
        System.out.println(size);

        // Total items
        for (String city : list) {
            System.out.println(city);
        }
        // İtem remove
        // list.remove("Ankara");
        // list.remove(0);
        // list.removeAll(Arrays.asList("Ankara","Istanbul"));

        // all item clear
        //list.clear();

        // index add
        list.add(2, "111111");


        // contains -> liste içinde var mı
        list.contains("Istanbul");
        System.out.println("Contain status: " + list.contains("Istanbul"));

        // addAll -> bir listenin başka bir  liste içine eklenmesi
        List<String> ls = new ArrayList<>();
        ls.add("1");
        ls.add("2");
        ls.add("3");
        ls.add("4");
        ls.add("5");

        list.addAll(ls);

        // indexOf -> bir değerin listedeki indexini söyler
        int index = list.indexOf("Istanbul");
        System.out.println(index);

        // lastIndexOf -> var olan değerin,aynı değerin sondaki indexini getirir

        // set -> var olan index değerini değiştirmeye yarar
        list.set(5, "Mersin"); //mugla yerine mersin

        // list.replaceAll(String::toLowerCase);

        // sort -> sıralama
        Collections.sort(list);
        //Collections.reverse(list);

        // listeyi diziye dönüştürme
        list.toArray();

        // diziyi listeye dönüştürme
        String[] arrx = {"Van","Ağrı"};
        List<String> newlist =Arrays.asList(arrx);

        // to iterator
        System.out.println("---------------------------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("iter: "+ iterator.next());
        }
        System.out.println("---------------------------");

        System.out.println(list);
    }
}
