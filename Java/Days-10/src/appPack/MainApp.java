package appPack;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        // HashMap
        // key-value
        // değer ekleme ->key(anahtar), val(değer)
        // anahtarlar benzersiz olmalı
        // aynı değerli anahtarlar eklendiğinde son eklenen değer geçerli olur
        // Sıralama algoritması önemli değildir
        // Hashmap olayların index kavramı yoktur
        // değerler keylere göre çağrılmış olurar
        // üretilirken <Key,Val> değerleri atanmalıdır

        HashMap<String, Object> hashMap = new HashMap<>();

        // değer atama
        String name = "Mert";
        String surname = "Topal";
        Integer age = 21;
        Boolean status = true;
        String address = "İstanbul";

        hashMap.put("name", name);
        System.out.println("name "+name.hashCode());

        hashMap.put("surname",surname);
        System.out.println("surname "+surname.hashCode());

        hashMap.put("age",age);
        System.out.println("age "+age.hashCode());

        hashMap.put("status",status);
        System.out.println("status "+status.hashCode());

        hashMap.put("address",address);
        System.out.println("address "+address.hashCode());

        // değerlere erişim
        Object nm = hashMap.get("name");
        System.out.println(nm);
        System.out.println("//////////////////////////////////////////////");


        // tüm elemanları ayrı ayrı yazdırma

        Set<String> keys = hashMap.keySet();
        for (String key: keys) {
            //System.out.println(key);
            Object val = hashMap.get(key);
            System.out.println(key + " : "+val );
        }


        // değer silme
        hashMap.remove(status);

        // tüm elemanları silme
        //hashMap.clear();


        // eleman sayısı
        int size =hashMap.size();
        System.out.println(size);

        System.out.println(hashMap);

    }
}
