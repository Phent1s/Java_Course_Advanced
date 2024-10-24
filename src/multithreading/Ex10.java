package multithreading;

public class Ex10 {
    public static void main(String[] args) {
        MyRunableImplimintation runable = new MyRunableImplimintation();
        Thread t1 = new Thread(runable);
        Thread t2 = new Thread(runable);
        Thread t3 = new Thread(runable);
        t1.start();
        t2.start();
        t3.start();


    }
}

class Counter{
    static int count = 0;
}

class MyRunableImplimintation implements Runnable{
    public void increment(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}