package multithreading;

import java.util.concurrent.*;

public class CallableFactorial {
    static int factorialResult;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Factorial1 factorial1 = new Factorial1(4);
        Future<Integer> future1 = executor.submit(factorial1);
        try {
            System.out.println(future1.isDone());
            System.out.println("Want a result");
            factorialResult = future1.get();
            System.out.println("Result received");
            System.out.println(future1.isDone());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            System.out.println(e.getCause());
        }
        finally {
            executor.shutdown();
        }
        System.out.println(factorialResult);
    }
}


class Factorial1 implements Callable<Integer> {
int f;
    public Factorial1(int f) {
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f<=0){
            throw new Exception("Wrong number!");
        }
        int result = 1;
        for (int i=1; i<=f; i++){
            result *= i;
            Thread.sleep(1000);
        }
        return result;
    }
}