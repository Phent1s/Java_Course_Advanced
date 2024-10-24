package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    public static void main(String[] args) {
    Call call = new Call();
    Thread th1 = new Thread(new Runnable() {
        @Override
        public void run() {
            call.mobileCall();
        }
    });
    Thread th2 = new Thread(new Runnable() {

        @Override
        public void run() {
            call.skypeCall();
        }
    });
    Thread th3 = new Thread(new Runnable() {
        @Override
        public void run() {
            call.whatsAppCall();
        }
    });
    th1.start();
    th2.start();
    th3.start();
    }
}

class Call{
    private Lock lock = new ReentrantLock();

    void mobileCall(){
        lock.lock();
        try {
            System.out.println("Mobile Call starts");
            Thread.sleep(3000);
            System.out.println("Mobile Call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }

    void skypeCall(){
        lock.lock();
        try {
            System.out.println("Skype Call starts");
            Thread.sleep(5000);
            System.out.println("Skype Call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }

    void whatsAppCall(){
        lock.lock();
        try {
            System.out.println("WhatsApp Call starts");
            Thread.sleep(7000);
            System.out.println("WhatsApp Call ends");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}
