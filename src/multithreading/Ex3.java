package multithreading;

public class Ex3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread3() {});
        Thread t2 = new Thread(new MyThread4() {});
        t1.start();
        t2.start();

    }
}


class MyThread3 implements Runnable {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

class MyThread4 implements Runnable {
    public void run() {
        for (int i = 1000; i > 0; i--) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}