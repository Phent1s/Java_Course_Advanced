package collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample {


    public static void main(String[] args) {
        TreeMap<Student,Double> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Trigulov", 4);
        Student st2 = new Student("Andrii", "Ovcharuk", 2);
        Student st3 = new Student("Ivan", "Olechov", 3);
        Student st4 = new Student("Stella", "Demchishin", 2);
        Student st5 = new Student("Vialik", "Dovbush", 5);
        Student st6 = new Student("Alex", "Alexandroiv", 1);
        Student st7 = new Student("Oleg", "Lakov", 6);
//        treeMap.put(5.6, st1);
//        treeMap.put(6.6, st2);
//        treeMap.put(7.1, st3);
//        treeMap.put(4.3, st4);
//        treeMap.put(9.8, st5);
//        treeMap.put(3.2, st6);
//        treeMap.put(8.9, st7);
//        System.out.println(treeMap);
//        System.out.println(treeMap.get(7.1));
//        System.out.println(treeMap.remove(4.3));
//        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.headMap(8.9));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());

        treeMap.put(st1, 5.6);
        treeMap.put(st2, 6.6);
        treeMap.put(st3, 7.1);
        treeMap.put(st4, 4.3);
        treeMap.put(st5, 9.8);
        treeMap.put(st6, 3.2);
        treeMap.put(st7, 8.9);
        System.out.println(treeMap);
    }
}
