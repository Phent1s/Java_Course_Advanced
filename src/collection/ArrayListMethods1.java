package collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Andrii");
        list.add("Ivan");
        list.add(1, "Alex");
        System.out.println(list);
        for(String s : list){
            System.out.println(s + " ");
        }
        System.out.println();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(1);

//        System.out.println(list.get(2));

//        list.set(1, "Masha");
//        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
