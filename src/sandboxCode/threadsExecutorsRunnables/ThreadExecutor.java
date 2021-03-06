package sandboxCode.threadsExecutorsRunnables;

import java.util.Random;


//thread example
public class ThreadExecutor implements Runnable {


    private int time;
    private String name;
    // For assigning a random sleep time.
    private Random r = new Random();

    public ThreadExecutor(String name) {
        this.name = name;
        time = r.nextInt(999);
    }

    public String getName() {
        return name;
    }

    @Override
    // Thread creation
    // implemented runnable from Thread Executors
    public void run() {
        // Prints name of the current thread
        System.out.println("Current thread = " + Thread.currentThread().getName());

        try {
            System.out.println("Doing a task during : " + name);
            Thread.currentThread().sleep(time);
        }
        // Exception for when a thread is interrupted.
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
