package multithreading;

import javax.sound.midi.Soundbank;

public class Ex8 extends Thread {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyRunable());
        Ex8 t2 = new Ex8();
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("finish");
    }
}


class MyRunable implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}