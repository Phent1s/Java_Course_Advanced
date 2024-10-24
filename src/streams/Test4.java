package streams;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

       int res = list.stream().reduce((accumulator, element) -> accumulator + element).get() ;
        System.out.println(res);

        List<String> list3 = new ArrayList<>();
        list3.add("Hello");
        list3.add("World");
        list3.add("Java");
        String res3 = list3.stream().reduce((accumulator, element) -> accumulator+ " 22 " + element).get();
        System.out.println(res3);
    }
}
