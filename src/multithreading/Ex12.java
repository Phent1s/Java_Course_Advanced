package multithreading;

public class Ex12 {

    static final SynchronizedClass sch = new SynchronizedClass();

    static final Object lock = new Object();
    void mobileCall() {
        synchronized (lock) {
            System.out.println("mobileCall starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("mobileCall ends");
        }

    }
    void skypeCall()  {
        synchronized (lock) {
            System.out.println("skypeCall starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("skypeCall ends");
        }

    }
    void whatsappCall()  {
        synchronized (lock) {
            System.out.println("whatsappCall starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("whatsappCall ends");
        }

    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunableImplMob());
        Thread thread2 = new Thread(new RunableImplSkype());
        Thread thread3 = new Thread(new RunableImplWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunableImplMob implements Runnable {
    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}

class RunableImplSkype implements Runnable {
    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}

class RunableImplWhatsapp implements Runnable {
    @Override
    public void run() {
        new Ex12().whatsappCall();
    }
}

class SynchronizedClass{

}