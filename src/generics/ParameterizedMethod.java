package generics;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        int a = GenMethod.getSecondElement(list);
        System.out.println(a);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("asv");
        list2.add("weq");
        list2.add("qwew");
        String s = GenMethod.getSecondElement(list2);
        System.out.println(s);
    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> list){
        return list.get(1);
    }
}
