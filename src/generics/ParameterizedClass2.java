package generics;

import org.w3c.dom.ls.LSOutput;

public class ParameterizedClass2 {


    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Hello", 123);
        System.out.println("Pair: value1 = " + pair.getValue1()
                + " value2 = " + pair.getValue2());
        Pair<Integer, Double> pair2 = new Pair<>(123, 1.23);
        System.out.println("Pair: value1 = " + pair2.getValue1()
                + " value2 = " + pair2.getValue2());
    }
}

class Pair<V1, V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V1 getValue1() {
        return value1;
    }
    public V2 getValue2() {
        return value2;
    }
}

class OtherPair<V>{
    private V value1;
    private V value2;

    public V abc(V val){
        return val;
    }

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
    public V getValue1() {
        return value1;
    }
    public V getValue2() {
        return value2;
    }
}