package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("dadwadsd"));
//        list.add(new Car());
        list.add("a");
        list.add("asadawdd");
        list.add("aawdwdwfdwdwd");
        list.add("adwadwadawdawdad");
        for(String o : list){
            System.out.println(o + " dlina " + o.length());
        }
    }
}


class Car{

}