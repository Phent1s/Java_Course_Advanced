package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Zaur", callBox);
        new Person("Andrii", callBox);
        new Person("Stella", callBox);
        new Person("Bella", callBox);
        new Person("Luka", callBox);
    }
}

class Person extends Thread {
    String name;
    private Semaphore callBox;
    public Person(String name, Semaphore callBox) {
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    public void run() {
        System.out.println(name + " wait...");
        try {
            callBox.acquire();
            System.out.println(name + " acquired");
            sleep(2000);
            System.out.println(name + " call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            callBox.release();
        }
    }
}
