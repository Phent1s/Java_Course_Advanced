package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Andrii");
        list.add("Ivan");
        list.add("Nikolay");
        list.add("Maria");
        list.add("Tolya");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);
    }
}
