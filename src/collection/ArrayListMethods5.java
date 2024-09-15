package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Andrii");
        list.add("Ivan");
        list.add("Nikolay");
        list.add("Maria");
        list.add("Tolya");

        List<Integer> list1 = List.of(3, 8, 13);
        System.out.println(list1);


        List<String> list2 = List.copyOf(list);
        System.out.println(list2);

//        System.out.println(list);
//
//        Object[] arr = list.toArray();
//        String[] arr2 = list.toArray(new String[0]);
//        for(String s : arr2){
//            System.out.println(s);
//        }
//    }

//        List<String> myList = list.subList(1,4);
//        System.out.println(myList);
//
//        myList.add("Fedor");
//        System.out.println(myList);
//        System.out.println(list);
//
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("Zaur");
//        list2.add("Andrii");
//        list2.add("Ihor");

//        list.removeAll(list2);
//        System.out.println(list);

//        list.retainAll(list2);
//        System.out.println(list);

//       boolean result = list.containsAll(list2);
//        System.out.println(result);
    }
}
