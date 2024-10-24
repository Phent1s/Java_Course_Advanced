package multithreading;

public class DemonThreadEx {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        UserThread ut = new UserThread();
        ut.setName("user_thread");
        DaemonThread dt = new DaemonThread();
        dt.setName("daemon_thread");
        dt.setDaemon(true);

        ut.start();
        dt.start();

        System.out.println("Main thread ends");
    }
}


class UserThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is demon" + isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DaemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + " is demon" + isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}