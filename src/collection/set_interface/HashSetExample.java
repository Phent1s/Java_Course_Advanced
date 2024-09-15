package collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Zaur");
        set.add("Andrii");
        set.add("Oleg");
        set.add("Marina");
        set.add("Ihor");
        set.add("Katya");

        set.remove("Zaur");
//        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Zaur"));
    }
}
