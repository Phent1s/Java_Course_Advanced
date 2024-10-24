package multithreading.trade_safe;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapEx {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "Zaur");
        map.put(2, "Andrii");
        map.put(3, "Stella");
        map.put(4, "Bella");
        map.put(5, "Alex");
        System.out.println(map);

        Runnable r = () -> {
            Iterator<Integer> it = map.keySet().iterator();
            while (it.hasNext()) { try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                Integer i = it.next();
                System.out.println(i + " : " + map.get(i));}

        };

        Runnable r1 = () -> {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            map.put(6, "Elena");
        };

        Thread th1 = new Thread(r);
        Thread th2 = new Thread(r1);
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println(map);
    }
}
