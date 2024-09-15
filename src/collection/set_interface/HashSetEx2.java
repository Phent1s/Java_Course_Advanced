package collection.set_interface;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(5);
        set1.add(7);
        set1.add(3);
        set1.add(10);
        set1.add(2);

        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(7);
        set2.add(4);
        set2.add(5);
        set2.add(3);
        set2.add(8);
        HashSet<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println(union);
        HashSet<Integer> intersect = new HashSet<Integer>(set1);
        intersect.retainAll(set2);
        System.out.println(intersect);
        HashSet<Integer> subtract = new HashSet<Integer>(set1);
        subtract.removeAll(set2);
        System.out.println(subtract);

    }
}
