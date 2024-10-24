package streams;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Good");
        list.add("How are u");
        list.add("ok");
        list.add("Bye");

//        for (int i = 0; i < list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }

        List<Integer> list2 = list.stream().map(elem -> elem.length()).collect(Collectors.toList());
        System.out.println(list2);


        int[] array = {5, 9, 3, 8, 1};
        array = Arrays.stream(array).map(elem
                -> {
            if (elem % 3 == 0) {
                elem = elem / 3;
            }
            return elem;
        }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<String>();
        set.add("Hello");
        set.add("Good");
        set.add("How are u");
        set.add("ok");
        set.add("Bye");
        System.out.println(set);
       Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
       System.out.println(set2);
       System.out.println(list3);

    }
}
