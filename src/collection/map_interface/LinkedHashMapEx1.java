package collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx1 {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<Double, Student>(16, 0.75f, true);
        Student st1 = new Student("Zaur", "Trigulov", 4);
        Student st2 = new Student("Andrii", "Ovcharuk", 2);
        Student st3 = new Student("Ivan", "Olechov", 3);
        Student st4 = new Student("Stella", "Demchishin", 2);
        Student st5 = new Student("Vialik", "Dovbush", 5);
        Student st6 = new Student("Alex", "Alexandroiv", 1);
        Student st7 = new Student("Oleg", "Lakov", 6);
        lhm.put(5.6, st1);
        lhm.put(6.6, st2);
        lhm.put(7.1, st3);
        lhm.put(4.3, st4);
        lhm.put(9.8, st5);
        lhm.put(3.2, st6);
        lhm.put(8.9, st7);
        System.out.println(lhm);
        System.out.println(lhm.get(5.6));
        System.out.println(lhm.get(8.9));
        System.out.println(lhm);
    }

}
