package collection.map_interface;

import java.util.Hashtable;

public class HashTableEx1 {
    public static void main(String[] args) {
        Hashtable<Double,Student> ht = new Hashtable<>();
        Student st1 = new Student("Zaur", "Trigulov", 4);
        Student st2 = new Student("Andrii", "Ovcharuk", 2);
        Student st3 = new Student("Ivan", "Olechov", 3);
        Student st4 = new Student("Stella", "Demchishin", 2);
        ht.put(7.8, st1);
        ht.put(9.3, st2);
        ht.put(5.8, st3);
        ht.put(6.0, st4);
        System.out.println(ht);
    }
}
