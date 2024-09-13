package generics;

import com.sun.jdi.InterfaceType;

public class ParameterizedClass {
    public static void main(String[] args) {
//        Info<String> info1 = new Info<>("Hello");
//        System.out.println(info1);
//        Info<Integer> info2 = new Info<>(17);
//        System.out.println(info2);
//        String s = info1.getValue();
//        Integer i = info2.getValue();
    }
}

class Info<T extends Number&I1&I2>{
    private T value;
    public Info(T value){
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info{" +
                value +
                '}';
    }

    public T getValue() {
        return value;
    }
}

interface I1{}
interface I2{}