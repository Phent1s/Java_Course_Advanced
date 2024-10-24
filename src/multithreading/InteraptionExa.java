package multithreading;

public class InteraptionExa {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");

        InteraptedThread thread = new InteraptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();
        thread.join();
        System.out.println("Main ends");
    }
}

class InteraptedThread extends Thread {
    double sqrtSum = 0;
    @Override
    public void run() {
        for (int i = 0; i <= 1000000000; i++) {
            if (isInterrupted()){
                System.out.println("Thread want to interrupt");
                return;
            }
            sqrtSum+=Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Thread want to interrupt during sleep");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
