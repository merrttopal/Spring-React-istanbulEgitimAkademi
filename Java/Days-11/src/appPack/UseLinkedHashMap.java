package appPack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseLinkedHashMap {
    public static void main(String[] args) {


        Map<String, Object> hm = new LinkedHashMap<>();
        hm.put("name","Mert");
        hm.put("surName","Topal");
        hm.put("age",22);
        hm.put("Status",true);


        System.out.println(hm);


        Map<String, Object> hmx = new HashMap<>();
        hmx.put("name","Mert");
        hmx.put("surName","Topal");
        hmx.put("age",22);
        hmx.put("Status",true);


        System.out.println(hmx);

    }
}