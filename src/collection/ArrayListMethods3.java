package collection;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Andrii");
        list.add("Ivan");
        System.out.println(list);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("!!!");
        list2.add("???");
        list.addAll(1, list2);
        System.out.println(list);



        System.out.println(list.size());

        list.clear();
        System.out.println(list);
    }
}
