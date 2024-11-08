package streams;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int[] array = {3, 8, 7, 5, 12, 4, 21, 81, 7, 18};
//        array = Arrays.stream(array).sorted().toArray;
//        System.out.println(Arrays.toString(array));
        int res = Arrays.stream(array).filter(x -> x % 2 == 1)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                }).reduce((a, e) -> a + e).getAsInt();
        System.out.println(res);
    }
}
