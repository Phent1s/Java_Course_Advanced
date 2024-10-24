package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Zaur", lock);
        new Employee("Andrii", lock);
        new Employee("Stella", lock);
        Thread.sleep(5000);
        new Employee("Luka", lock);
        new Employee("Bella", lock);
    }

}


class Employee extends Thread {
    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    public void run() {
        if(lock.tryLock()) {
            try {
//            System.out.println("Employee " + name + " wait");
//            lock.lock();
                System.out.println(name + " use bankomat");
                Thread.sleep(2000);
                System.out.println(name + " end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " dont want to wait");
        }

    }
}