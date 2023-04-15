package appPack;

import java.util.HashMap;
import java.util.Map;

public class UseEnum {
    public static void main(String[] args) {
        // Enum -> Key

        Map<EKeys ,Object > hmt = new HashMap<>();
        hmt.put(EKeys.name,"Mert");
        hmt.put(EKeys.surname,"Topal");
        hmt.put(EKeys.age,40);
        System.out.println(hmt);

        System.out.println(hmt.get(EKeys.name));

        EKeys status = EKeys.name;
        switch ( status){
            case name:;
                break;
            case age:
                break;
            case surname:
                break;
        }
    }
}
