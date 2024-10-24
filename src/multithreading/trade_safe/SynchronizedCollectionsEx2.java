package multithreading.trade_safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedCollectionsEx2 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < 1000; i++) {
            al.add(i);
        }
        List<Integer> synchList = Collections.synchronizedList(al);
        Runnable runnable = () -> {
            synchronized (synchList) {
                Iterator<Integer> iter = synchList.iterator();
                while (iter.hasNext()) {System.out.println(iter.next());}
            }

        };

        Runnable runnable2 = () -> {
            synchList.remove(10);
        };
        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(synchList  );
    }

}
