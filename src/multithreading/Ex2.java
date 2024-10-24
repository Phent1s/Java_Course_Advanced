package multithreading;

public class Ex2 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {


        Ex2 ex = new Ex2();
        ex.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }


//        MyThread myThread = new MyThread();
//        MyThread2 myThread2 = new MyThread2();
//        myThread.start();
//        myThread2.start();
    }
}

//class MyThread extends Thread {
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class MyThread2 extends Thread {
//    public void run() {
//        for (int i = 1000; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}

