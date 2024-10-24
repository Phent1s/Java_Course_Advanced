package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx1 {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService exs = Executors.newFixedThreadPool(5);
        ExecutorService exs = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            exs.execute(new RunnableImp100());
        }
        exs.shutdown();
        exs.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Main ends");
    }
}


class RunnableImp100 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}