package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Privet", "Kak dela?", "normal", "poka");
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach(str -> System.out.println(str));
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.forEach(e1 -> {
            System.out.println(e1);
            e1 *= 2;
            System.out.println(e1);
        });
    }
}
