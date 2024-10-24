package multithreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 mt5 = new MyThread5();
        mt5.setName("MyThread5");
        mt5.setPriority(3);
        System.out.println("Name of mt5 = " + mt5.getName()
                + " Priority = " + mt5.getPriority());
        mt5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of mt5 = " + mt5.getName()
        + " Priority = " + mt5.getPriority());
        MyThread5 mt6 = new MyThread5();
        System.out.println("Name of mt5 = " + mt6.getName()
                + " Priority = " + mt6.getPriority());

        mt5.start();
        mt6.start();
    }
}

class MyThread5 extends Thread {
    public void run() {
        System.out.println("MyThread5 is running");
    }
}
