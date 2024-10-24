package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEX {
//    static int counter = 0;
static AtomicInteger counter = new AtomicInteger();

    public  static void increment(){
//        counter.incrementAndGet();
        counter.addAndGet(5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter);
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

        }
    }
}
