package multithreading;

public class SynchBlock1 {
    public static void main(String[] args) {
        MyRunableImplimintation2 runable = new MyRunableImplimintation2();
        Thread t1 = new Thread(runable);
        Thread t2 = new Thread(runable);
        Thread t3 = new Thread(runable);
        t1.start();
        t2.start();
        t3.start();


    }
}
class Counter2{
    static int count = 0;
}

class MyRunableImplimintation2 implements Runnable{
    private void doWork2() {
        System.out.println("Ura");
    }

    private void doWork1(){
        doWork2();
        synchronized(this){
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}