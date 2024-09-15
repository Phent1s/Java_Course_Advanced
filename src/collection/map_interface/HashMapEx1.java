package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1000, "Andrii Ovcharuk");
        map.put(3251, "Stella Demchenko");
        map.put(12341, "Lokya Petrov");
        map.put(5213, "Mariya Sidorova");
        map.putIfAbsent(5213, "Mariya Sidorova");

        System.out.println(map);
//        System.out.println(map.get(1000));
        map.remove(3251);
        System.out.println(map);
        System.out.println(map.containsValue("Andrii Ovcharuk"));
        System.out.println(map.containsKey(500));
        System.out.println(map.keySet());
        System.out.println(map.values());
    }
}
