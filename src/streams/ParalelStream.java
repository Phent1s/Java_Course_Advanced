package streams;

import java.util.ArrayList;
import java.util.List;

public class ParalelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<Double>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);


//        double sumResult = list.parallelStream()
//                .reduce((accum, elem) -> accum + elem).get();
//        System.out.println("sim = " + sumResult );

        double divisionResult1 = list.stream()
                .reduce((accum, elem) -> accum/elem).get();
        System.out.println("Division = " + divisionResult1 );

        double divisionResult = list.parallelStream()
                .reduce((accum, elem) -> accum/elem).get();
        System.out.println("Division = " + divisionResult );
    }
}
