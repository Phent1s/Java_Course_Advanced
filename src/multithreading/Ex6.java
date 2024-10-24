package multithreading;

public class Ex6 implements Runnable {
    @Override
    public void run() {
        System.out.println("Running Thread");
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6());
        thread.start();

        System.out.println("Main Thread");
        System.out.println("Thread name: " + Thread.currentThread().getName());

    }
}
 