package multithreading;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Starts");
        Thread threadd = new Thread(new Worker());
        System.out.println(threadd.getState());
        threadd.start();
        System.out.println(threadd.getState());
        threadd.join();
        System.out.println(threadd.getState());
        System.out.println("Main Ends");
    }
}

class Worker extends Thread {
    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work ends");
    }
}