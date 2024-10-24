package lambda;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("Bye");
        list.add("Okey");
        list.add("Lambdas");
        list.add("Lear Java");
        System.out.println(list);
        list.removeIf(s -> s.length() > 5);
        System.out.println(list);
    }
}
