package appPack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class UseSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("ali");
        set.add("hasan");
        set.add("kadir");
        set.add("kadir");
        set.add("kadir");
        set.add("taner");
        set.add("taner");
        System.out.println(set);

        Set<String> setOrder = new LinkedHashSet<>();
        setOrder.add("ali");
        setOrder.add("ali");
        setOrder.add("hasan");
        setOrder.add("hasan");
        setOrder.add("kadir");
        setOrder.add("kadir");
        setOrder.add("kadir");
        setOrder.add("taner");
        setOrder.add("taner");
        System.out.println(setOrder);


        Set<User> userSet = new LinkedHashSet<>();
        User user1 = new User();
        user1.setName("mert");
        user1.setAge(21);
        userSet.add(user1);

        User user2 = new User();
        user1.setName("mert");
        user1.setAge(21);
        userSet.add(user1);
        System.out.println(userSet.size());

    }
}
