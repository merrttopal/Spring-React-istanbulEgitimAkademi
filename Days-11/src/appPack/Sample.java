package appPack;

import java.util.*;

public class Sample {
    public static void main(String[] args) {
        // ArrayList üretilirken ata tür olan list kullanılır

        // List
        List<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        // HashMap
        Map<String, String> hm = new HashMap<>();
        HashMap<String, String> hmx = new HashMap<>();

        // Set -> Benzersiz değerler, sıralama önemsiz
        Set<String> set = new HashSet<>();

        // LinkedHastSet sıralama önemli
        Map<String,String> linkedSet = new LinkedHashMap<>();


        // LinkedHashMap > sıralama önemli
        Map<String,String> linkedHashMap = new LinkedHashMap<>();


    }
}
