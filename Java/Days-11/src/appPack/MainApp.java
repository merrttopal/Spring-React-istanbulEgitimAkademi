package appPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {

        List<Map<String, String>> ls = new ArrayList<>();

        Map<String , String> hm1 = new HashMap<>();
        hm1.put("name","mert");
        hm1.put("age","22");
        ls.add(hm1);

        HashMap<String , String> hm2 = new HashMap<>();
        hm2.put("name","ahmet");
        hm2.put("age","25");
        ls.add(hm2);

        HashMap<String , String> hm3 = new HashMap<>();
        hm3.put("name","kadir");
        hm3.put("age","23");
        ls.add(hm3);

        for (Map<String, String> hashMap: ls
        ) {
            System.out.println(hashMap);
        }
    }
}
