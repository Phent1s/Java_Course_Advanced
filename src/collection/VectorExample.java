package collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("Zaur");
        v.add("Katya");
        v.add("Misha");
        v.add("Oleg");
        System.out.println(v);
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        v.remove(2);
        System.out.println(v);
        System.out.println(v.get(1));
    }
}
