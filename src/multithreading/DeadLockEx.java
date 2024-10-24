package multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread1 = new Thread10();
        Thread20 thread2 = new Thread20();
        thread1.start();
        thread2.start();
    }
}

class Thread10 extends Thread {
    public void run() {
        System.out.println("Thread10: Trying to capture lock1 monitor");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread10: Lock1 monitor is captured");

            System.out.println("Thread10: Trying to capture lock2 monitor");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread10: Lock2 monitor is captured and lock1 too");
            }
        }

    }
}

class Thread20 extends Thread {
    public void run() {
        System.out.println("Thread20: Trying to capture lock1 monitor");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread20: Lock1 monitor is captured");

            System.out.println("Thread20: Trying to capture lock2 monitor");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread20: Lock2 monitor is captured and lock1 too");
            }
        }

    }
}