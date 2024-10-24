package multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDawnLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff is on place");
        countDownLatch.countDown();
        System.out.println("CountDown = " + countDownLatch.getCount());
    }
    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready, so let's open market");
        countDownLatch.countDown();
        System.out.println("CountDown = " + countDownLatch.getCount() );
    }
    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is open");
        countDownLatch.countDown();
        System.out.println("CountDown = " + countDownLatch.getCount() );
    }
    public static void main(String[] args) throws InterruptedException {
        new Friend("Zaur", countDownLatch);
        new Friend("Andrii", countDownLatch);
        new Friend("Stella", countDownLatch);
        new Friend("Bella", countDownLatch);
        new Friend("Illya", countDownLatch);

        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();
    }
}


class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;
    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run() {
        try {
            countDownLatch.await();
            System.out.println("Friend " + name + " starts buying");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
