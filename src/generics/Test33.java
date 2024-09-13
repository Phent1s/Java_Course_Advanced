package generics;

import java.util.ArrayList;
import java.util.List;

public class Test33 {



    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<? extends Number> list33 = new ArrayList<>();
        List<? super Number> list333 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        list.add("Ok");
        list.add("Hello");
        list.add("Bye");
        showLostInfo(list);
        list2.add(3.14);
        list2.add(123.321);
        list2.add(3.156);
        showLostInfo(list2);

        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(123.321);
        list1.add(3.156);
        System.out.println(sum(list1));

    }

    static void showLostInfo(List<?> list){
        System.out.println("List contains: " + list);
    }

    public static double sum(ArrayList<? extends Number> list){
        double sum = 0;
        for (Number n : list){
            sum += n.doubleValue();
        }return sum;
    }
}
