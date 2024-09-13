package compration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Andrii");
        list.add("Stella");
        list.add("David");
        System.out.println("List before");
        System.out.println(list);
        System.out.println("List before");
        Collections.sort(list);
        System.out.println("list after");
        System.out.println(list);
    }
}
